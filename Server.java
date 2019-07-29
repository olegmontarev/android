package gb.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.*;

public class Server {
    private Vector<ClientHandler> clients;

    private static final Logger logger = Logger.getLogger(gb.server.Server.class.getName());

    public Server() throws SQLException {

        Handler handler = null;
        try {
            handler = new FileHandler("mylog.log", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);} catch (NullPointerException e) {e.printStackTrace();}



        clients = new Vector<>();
        ServerSocket server = null;
        Socket socket = null;
        try {
            AuthService.connect();
            server = new ServerSocket(8189);
            logger.info("Сервер запущен. Ожидаем клиентов...");
            while (true) {
                socket = server.accept();
                 new ClientHandler(this, socket);
               // clients.add(new ClientHandler(this, socket));
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "Ошибка при подключении" + e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                logger.log(Level.WARNING, "Ошибка при закрытии сокетов" + e);
            }
            try {
                server.close();
            } catch (IOException e) {
                logger.log(Level.WARNING, "Ошибка при закрытии сервера" + e);
            }
            AuthService.disconnect();
        }
    }

    public void broadcastMsg(ClientHandler from, String msg) {
        for (ClientHandler o : clients) {
            if(!o.checkBlackList(from.getNick())) {
                o.sendMsg(msg);
                logger.info("Сообщение от " + msg);
            }
        }
    }

    public boolean isNickBusy(String nick) {
        for (ClientHandler o: clients){
            if(o.getNick().equals(nick)) {
                return true;
            }
        }
        return false;
    }

    public void broadcastClientList() {
        StringBuilder sb = new StringBuilder();
        sb.append("/clientList ");
        for (ClientHandler o: clients) {
            sb.append(o.getNick() + " ");
        }
        String out = sb.toString();

        for(ClientHandler o: clients) {
            o.sendMsg(out);
        }
    }

    public void sendPersonalMsg(ClientHandler from, String nickTo, String msg) {
        for (ClientHandler o: clients) {
            if(o.getNick().equals(nickTo)) {
                o.sendMsg("from " + from.getNick() + ": " + msg);
                from.sendMsg("to " + nickTo + ": " + msg);
                logger.info("PM from " + from.getNick() + " to " + nickTo + ": " + msg);
                return;
            }
        }
        from.sendMsg("Клиент с ником " + nickTo + ": " + msg);
    }

    public void subscribe(ClientHandler client) {
        clients.add(client);
        broadcastClientList();
        logger.info("Клиент " + client + " подключился");
    }

    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
        broadcastClientList();
        logger.info("Клиент " + client + " отключился");
    }
}

package Lesson_6.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    private Vector<ClientHandler> clients;
    private static int clientsCount = 0;

    public Main() {
        clients = new Vector<>();
        Socket socket = null;
        ServerSocket server = null;

        try {
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен");

            while (true) {
                socket = server.accept();
                System.out.println("Клиент подключился");
                clients.add(new ClientHandler(socket, this));
                clientsCount++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void broadCastMsg(String msg) {
        for (ClientHandler o : clients) {
                o.sendMsg(msg);
            }
    }

    public void removeClient(ClientHandler forremove) {
        clients.remove(forremove);
        clientsCount--;
        System.out.println("Клиентов в чате: " + clientsCount);
    }
}

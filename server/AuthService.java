package Lesson_6.server;

import java.sql.*;
import java.util.List;

public class AuthService {
    private static Connection connection;
    private static Statement stmt;

    public static void connection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:mainDB.db");
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getNickByLoginAndPass(String login, String pass) {
        String sql = String.format("SELECT nickname FROM main where login = '%s' and password = '%s'", login, pass);

        try {
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                return rs.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String registration(int id, String login, String pass, String nickname) {

        String reg = String.format("INSERT INTO main (id, login, password, nickname) VALUES ('%s', '%s', '%s', '%s')", id, login, pass, nickname);

        try {
            System.out.println("Попытка регистрации");
            stmt.executeQuery(reg);
            System.out.println("Успешно");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String addBlacklist(String blacklist, String nick) {

        String db = String.format("UPDATE main SET blacklist = '%s' WHERE nickname = '%s'", blacklist, nick);

        try {
            stmt.executeQuery(db);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

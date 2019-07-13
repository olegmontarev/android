import java.sql.*;

public class Workers {
    private static Connection conn;
    private static Statement stmt;

    public static void main(String[] args) throws SQLException {

        try {
            connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        stmt.executeUpdate("CREATE TABLE workers (" + "id INTEGER PRIMARY KEY AUTOINCREMENT," + "name TEXT," +
                "salary TEXT," + "position TEXT)");

        stmt.executeUpdate("INSERT INTO workers (name, salary, position) VALUES ('Ivan', 100000, 'manager');");
        stmt.executeUpdate("INSERT INTO workers (name, salary, position) VALUES ('Andrey', 200000, 'CTO');");
        stmt.executeUpdate("INSERT INTO workers (name, salary, position) VALUES ('Sergey', 150000, 'developer');");
        stmt.executeUpdate("INSERT INTO workers (name, salary, position) VALUES ('Semen', 200000, 'CMO');");
        stmt.executeUpdate("INSERT INTO workers (name, salary, position) VALUES ('Dmitry', 250000, 'CEO');");

        stmt.executeUpdate("DELETE FROM workers where id = 2");

        ResultSet rs = stmt.executeQuery("SELECT id, name, salary, position FROM workers");

        while (rs.next()) {
            System.out.println(rs.getString("id") + " " + rs.getString("name") + " ");
        }
}

    public static void connection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:newDB.db");
        stmt = conn.createStatement();
    }

    public static void disconect() throws SQLException {
        conn.close();
    }
}

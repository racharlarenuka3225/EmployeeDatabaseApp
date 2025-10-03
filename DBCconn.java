
package advJava;
import java.sql.*;

public class DBCconn {
    private static final String url = "jdbc:mysql://localhost:3306/employee_db";
    private static final String username = "root";
    private static final String password = "Renuka@3225";  // ✅ Your actual MySQL password
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
            con = DriverManager.getConnection(url, username, password);
            System.out.println("✅ Database Connected Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}




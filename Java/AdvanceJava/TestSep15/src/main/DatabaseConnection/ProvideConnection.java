package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProvideConnection {
    static String url = "jdbc:mysql://localhost:3306/servlet_Demo";
    static String userName = "root";
    static String password = "Moofie@2901";
    static String driver = "com.mysql.jdbc.Driver";
    static Connection connection = null;

    public ProvideConnection() {}
    public static Connection getConnection(){
        if(connection == null){
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url,userName,password);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

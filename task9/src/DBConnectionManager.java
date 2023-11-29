import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

    private static DBConnectionManager instance;

    private Connection connection;


    private DBConnectionManager() throws SQLException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "username", "password");
    }


    public static synchronized DBConnectionManager getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnectionManager();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

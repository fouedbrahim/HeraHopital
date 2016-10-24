package technique;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.imageio.IIOException;

/**
 *
 * @author Yahya
 */
public class MyConnexion {

    Properties properties;

    private String url = "jdbc:mysql://127.0.0.1:3306/hera";
    static String login = "root";
    static String pwd = "";
    private static Connection instance;

    private MyConnexion() { //properties=new Properties();
        try {
            // properties.load(new FileInputStream (new File("configuration.properties")));
            instance = DriverManager.getConnection(url, login, pwd);
            System.out.println("connection etabie ");
        } catch (SQLException /*|IOException*/ ex) {
            ex.printStackTrace();

        }
    }

    public static Connection getInstance() {
        if (instance == null) {
            new MyConnexion();
        }
        return instance;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Connection cnx = MyConnexion.getInstance();
        
    }

}
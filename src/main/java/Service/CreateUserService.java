package Service;

import Repository.BaseConnection;
import org.example.Main;

import java.sql.*;

public class CreateUserService extends BaseConnection {
    public static void main(String[] args) {
        CreateUserService obj =new CreateUserService();
        obj.insertUserr("pakistan","zindabad");
    }

    public  void insertUserr(String username, String password) {
        String query = "INSERT INTO `POS`.`User` VALUES ( '"+username+"','"+password+"')";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(query);
            stmt.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

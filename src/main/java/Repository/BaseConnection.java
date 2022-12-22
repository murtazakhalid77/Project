package Repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseConnection {
       public final String DB_URL = "jdbc:mysql://localhost:3306/POS";
    public  final String USER = "root";
    public final String PASS = "password";
        Connection conn=null;
    public BaseConnection() {
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
}

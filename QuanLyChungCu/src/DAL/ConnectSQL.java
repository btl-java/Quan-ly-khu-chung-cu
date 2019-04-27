package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PhamDai
 */
public class ConnectSQL {

    public ConnectSQL() {
    }
    
    private final static String URL = "jdbc:sqlserver://;databaseName=QuanLyChungCu";
    private final static String USERNAME = "sa";
    private final static String PASSWORD = "123!@#";
    private static Connection conn = null;
    
    public static Connection connect(){
        try {
            conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void close(){
        if(conn!=null) try {
            conn.close();
            conn = null;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    
    
   /* public static void main(String[] args) {
        if(connect()!= null) System.out.println("Success!");
        else System.out.println("Fail!");       
        close();
    }*/
    
}

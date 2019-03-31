package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    private final static String USERNAME = "admin";
    private final static String PASSWORD = "123456";
    private static Connection conn = null;
    
    public static Connection connect(){
        try {
            conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    //test connection
//    public static void main(String[] args) throws SQLException {
//        
//        Connection connection=connect();
//        Statement statement=connection.createStatement();
//        ResultSet resultSet=statement.executeQuery("select * from CANHO");
//        while (resultSet.next()) {            
//            System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+
//                    resultSet.getString(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5)+"\t"+resultSet.getString(6)+"\t"+resultSet.getString(1)+"\t");
//        }
//    }
}

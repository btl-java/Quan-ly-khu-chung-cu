
package BLL;
import DAL.ConnectSQL;
import Entities.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author PhamDai
 */
public class CanHoBLL {
    private CanHoBLL(){
        
    }
    
    public static ArrayList<CanHo> show(){
        ArrayList<CanHo> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT * FROM CANHO");
       
            while (r.next()){
                list.add(new CanHo(r.getString("MaCanHo"),r.getFloat("DienTich"),r.getInt("Gia"),
                        r.getBoolean("TrangThai"),r.getInt("SoPhong"),r.getString("MaCuDan"),r.getString("MaKhu")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
    
    public static boolean insert(CanHo canHo,KhuCanHo khu){
        try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement
            ("INSERT [dbo].[CANHO] VALUES (?, ?, ?, ?, ?, ?, ?)");
            //N'AA1203, 46, 1400000000, 0, 4, NULL, N'AA'
              pre.setString(1, "AA1414");
              pre.setFloat(2, 50.36f);
              pre.setLong(3, 1254698725);
              pre.setBoolean(4, false);
              pre.setInt(5, 10);
              pre.setNull(6,java.sql.Types.VARCHAR);
              pre.setString(7, "AA");
              return pre.executeUpdate() > 0;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static boolean update(){
        return false;
    }
    
    public static boolean delete(){
        return false;
    }
    
//    public static void main(String[] args) {
//        
//        for(CanHo c : show()){
//            System.out.println(c);
//        }
//        
//    }
    
}

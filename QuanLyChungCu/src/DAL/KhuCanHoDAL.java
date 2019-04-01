/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
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
public class KhuCanHoDAL {
  
    private KhuCanHoDAL() {
        
    }
    
    public static ArrayList<KhuCanHo> show(){
        
        ArrayList<KhuCanHo> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT * FROM KHUCANHO");
        
            while (r.next()){
                list.add(new KhuCanHo(r.getString(1), r.getString(2), r.getInt(3), r.getInt(4), r.getString(5)));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
    
    public static boolean insert(KhuCanHo khu){  
         try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement
            ("INSERT INTO [dbo].[KHUCANHO] VALUES (?, ?, ?, ?, ?)");
              pre.setString(1, khu.getMaKhu());
              pre.setString(2, khu.getTenKhu());
              pre.setInt(3, khu.getSoTang());
              pre.setInt(4, khu.getSoCanTT());
              pre.setString(5,khu.getDiaChi());
              
              return pre.executeUpdate() > 0;
              
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static boolean update(){
           try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("update...");
            
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
    
    public static boolean delete(){
           try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("delete...");
            
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }    
    
    //--------------------------------------------------
//    public static void main(String[] args) {
//        if(insert()) System.out.println("Sucess!");
//        else System.out.println("Fail!");
//    }
//        
}

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
import javax.swing.JOptionPane;

/**
 *
 * @author PhamDai
 */
public class CanHoDAL {
        
    public static ArrayList<CanHo> show(){
        ArrayList<CanHo> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT * FROM CANHO");
       
            while (r.next()){
                list.add(new CanHo(r.getString("MaCanHo"),r.getFloat("DienTich"),r.getLong("Gia"),
                        r.getBoolean("TrangThai"),r.getInt("SoPhong"),r.getString("MaCuDan"),r.getString("MaKhu")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
    
    public static boolean inserts(ArrayList<CanHo> list){
        
        try {
            PreparedStatement pre ;
            for(CanHo c : list){

               pre = ConnectSQL.connect().prepareStatement
                ("INSERT [dbo].[CANHO] ([MaCanHo], [DienTich], [Gia], [TrangThai], [SoPhong], [MaCuDan], [MaKhu])"
                       + "VALUES (?, ?, ?, ?, ?, ?, ?)");
               pre.setString(1, c.getMaCanHo());
               pre.setFloat(2, c.getDienTich());
               pre.setLong(3,c.getGia());
               pre.setBoolean(4, c.isTrangThai());
               pre.setInt(5, c.getSoPhong());
               pre.setString(6, c.getMaCuDan());
               pre.setString(7, c.getMaKhu());
               
               pre.executeUpdate();
 
            }
            return true;
              
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static boolean update(String maCanHo,long gia,int soPhong){
         try {
               
               PreparedStatement pre = ConnectSQL.connect().prepareStatement
                    ("UPDATE dbo.CANHO SET Gia = ?,SoPhong = ? WHERE MaCanHo = ?");
                pre.setLong(1, gia);
                pre.setInt(2, soPhong);
                pre.setString(3, maCanHo);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
    
    public static boolean update(String maCanHo,String maCuDan){
         try {
               
               PreparedStatement pre = ConnectSQL.connect().prepareStatement
                    ("UPDATE dbo.CANHO SET TrangThai = ?, MaCuDan = ? WHERE MaCanHo = ?");
                pre.setBoolean(1, true);
                pre.setString(2, maCuDan);
                pre.setString(3, maCanHo);
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
 
    }
            
     public static ArrayList<CanHo> search(String text){
        ArrayList<CanHo> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("  SELECT * FROM dbo.CANHO WHERE MaCanHo LIKE '%"+text+"%' OR DienTich LIKE '%"+text+"%' OR Gia LIKE '%"+text+"%' \n" +
            "  OR TrangThai LIKE '%"+text+"%' OR SoPhong LIKE '%"+text+"%' OR MaCuDan LIKE '%"+text+"%' OR MaKhu LIKE '%"+text+"%'");
       
            while (r.next()){
                list.add(new CanHo(r.getString("MaCanHo"),r.getFloat("DienTich"),r.getLong("Gia"),
                        r.getBoolean("TrangThai"),r.getInt("SoPhong"),r.getString("MaCuDan"),r.getString("MaKhu")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
}

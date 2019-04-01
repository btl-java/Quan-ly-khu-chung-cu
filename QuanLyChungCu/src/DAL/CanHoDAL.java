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
public class CanHoDAL {
        
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
    
    public static boolean inserts(ArrayList<CanHo> list){
        try {
            PreparedStatement pre= null;
            for(CanHo c: list){
                pre = ConnectSQL.connect().prepareStatement
                    ("INSERT [dbo].[CANHO] VALUES (?, ?, ?, ?, ?, ?, ?)");
                pre.setString(1, c.getMaCanHo());
                pre.setFloat(2, c.getDienTich());
                pre.setLong(3, c.getGia());
                pre.setBoolean(4, c.isTrangThai());
                pre.setInt(5, c.getSoPhong());
                pre.setNull(6,java.sql.Types.VARCHAR);
                pre.setString(7, c.getMaKhu()); 
                pre.executeUpdate();
            }
            return true;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static ArrayList<CanHo> test(ArrayList<CanHo> lists){
        return lists;
    }
    public static boolean update(){
        return false;
    }
    
    public static boolean delete(){
        return false;
    }
    
    public static void main(String[] args) {
        for(CanHo c: test()){
            System.out.println(c);
        }
        
        
    }
}

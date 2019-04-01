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
public class TaiKhoanDAL {
    
    private TaiKhoanDAL(){
        
    }
    
    public static ArrayList<TaiKhoan> show(){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        try {
            Statement s = ConnectSQL.connect().createStatement();
            ResultSet r =  s.executeQuery("SELECT * FROM TAIKHOAN WHERE VaiTro='0'");
       
            while (r.next()){
                list.add(new TaiKhoan(r.getString("TenTaiKhoan"), r.getString("MatKhau"), r.getBoolean("VaiTro")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
    
    public static boolean insert(String tenTaiKhoan,String matKhau) {
        
        try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("INSERT [dbo].[TAIKHOAN] VALUES (?, ?, ?)");
            pre.setString(1,tenTaiKhoan);
            pre.setString(2,matKhau);
            pre.setBoolean(3,false);
            pre.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            return false;
        }
 
    }
    
    public static boolean update(String tenTaiKhoan,String matKhau){
        try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("UPDATE TAIKHOAN SET MatKhau = ? WHERE TenTaiKhoan =?");
            pre.setString(1,matKhau);
            pre.setString(2,tenTaiKhoan);
            return  pre.executeUpdate()>0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean delete(String tenTaiKhoan){
        try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("DELETE TAIKHOAN WHERE TenTaiKhoan = ?");
            pre.setString(1,tenTaiKhoan);
            return pre.executeUpdate()>0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
//    public static void main(String[] args) {
//        for(TaiKhoan tk : show()){
//            System.out.println(tk);
//        }
//    }
    
}

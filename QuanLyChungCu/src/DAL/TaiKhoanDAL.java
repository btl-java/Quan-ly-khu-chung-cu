/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.*;
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
            ResultSet r =  s.executeQuery("SELECT * FROM TAIKHOAN");
       
            while (r.next()){
                list.add(new TaiKhoan(r.getString("TenTaiKhoan"), r.getString("MatKhau"), r.getBoolean("VaiTro")));
            }   
            
        } catch (SQLException ex) {
            return null;
        }
        
        return list;
    }
    
    public static boolean insert(TaiKhoan canho){
        return false;
    }
    
    public static boolean update(){
        return false;
    }
    
    public static boolean delete(){
        return false;
    }
    
//    public static void main(String[] args) {
//        for(TaiKhoan tk : show()){
//            System.out.println(tk);
//        }
//    }
    
}

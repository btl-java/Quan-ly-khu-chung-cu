/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.*;
import Entities.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableModel;

/**
 *
 * @author PhamDai
 */
public class TaiKhoanBLL {
    private TaiKhoanBLL(){
        
    }
    
    public static TableModel show(){
        ArrayList<TaiKhoan> list = TaiKhoanDAL.show(false);
        String[] colunmNames = {"Username","Password"};
        Object[][] data = new Object[list.size()][colunmNames.length];
        for(int i =0;i<list.size();i++){
            data[i][0] = list.get(i).getTenTaiKhoan();
            data[i][1] = list.get(i).getMatKhau();
        }
        
        return new DefaultTableModel(data,colunmNames);
    }
    
    public static boolean check(String tenTaiKhoan,String matKhau){
         ArrayList<TaiKhoan> list = TaiKhoanDAL.show(true);
         if(tenTaiKhoan.equalsIgnoreCase(list.get(0).getTenTaiKhoan()) && matKhau.equalsIgnoreCase(list.get(0).getMatKhau())){
             return true;
         }
         return false;
    }
    public static boolean insert(String tenTaiKhoan,String matKhau){
        return TaiKhoanDAL.insert(tenTaiKhoan,matKhau);  
    }
    
    public static boolean update(String tenTaiKhoan,String matKhau,boolean vaiTro){
        return TaiKhoanDAL.update(tenTaiKhoan,matKhau,vaiTro);
        
    }
    
     public static boolean update(String tenTaiKhoan,String matKhau){
        return TaiKhoanDAL.update(tenTaiKhoan,matKhau);
        
    }
    
    public static boolean delete(String tenTaiKhoan){
        return TaiKhoanDAL.delete(tenTaiKhoan);
    }
}

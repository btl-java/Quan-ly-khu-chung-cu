/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author quocc
 */
public class ThongTinCanHoDAL {
    public static ResultSet BangThongTinCanHo() throws SQLException{
        String query="select MaCanHo,DienTich,Gia,SoPhong,MaKhu from CANHO where TrangThai=0";
        ResultSet rs=ConnectSQL.connect().createStatement().executeQuery(query);
        while (rs.next()) {            
            return rs;
        }
        return null;
    }
    
//    public static void main(String[] args) throws SQLException {
//        System.out.println(BangThongTinCanHo().getString(2));
//    }
}

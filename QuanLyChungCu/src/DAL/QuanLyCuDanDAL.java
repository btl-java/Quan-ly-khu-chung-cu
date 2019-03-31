/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.CuDan;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author quocc
 */
public class QuanLyCuDanDAL {

    public static ResultSet BangThongTinCuDan() throws SQLException {
        String query = "select cd.*,ch.MaCanHo from CUDAN cd inner join CANHO ch\n"
                + "on cd.MaCuDan=ch.MaCuDan";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        while (rs.next()) {
            return rs;
        }
        return null;
    }
    
    public static void updateCD_DAL(CuDan cd){
        try {
            ConnectSQL.connect().createStatement().executeUpdate("update CUDAN set \n"
                    +"TenCuDan=N'"+cd.getTenCuDan()+"', NgaySinh='"+cd.getNgaySinh()+"',\n"
                    + "GioiTinh='"+cd.isGioiTinh()+"',SoDT='"+cd.getSoDT()+"',\n"
                    + "SoCMT='"+cd.getSoCMT()+"',QueQuan=N'"+cd.getQueQuan()+"' \n"
                    + "where MaCuDan='"+cd.getMaCuDan()+"'");
        } catch (SQLException e) {
            System.out.println("Error in updateCD_DAL: "+e.getMessage());
        }
    }

//    public static void main(String[] args) throws SQLException {
//        System.out.println(BangThongTinCuDan().getString(1));
//        System.out.println(BangThongTinCuDan().getString(2));
//        System.out.println(BangThongTinCuDan().getString(3));
//        System.out.println(BangThongTinCuDan().getString(4));
//        System.out.println(BangThongTinCuDan().getString(5));
//        System.out.println(BangThongTinCuDan().getString(6));
//        System.out.println(BangThongTinCuDan().getString(7));
//        System.out.println(BangThongTinCuDan().getString(8));
//    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.CuDan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author quocc
 */
public class QuanLyCuDanDAL {

    //Begin TabQuanLyCuDan
    public static List<CuDan> dsCuDan() throws SQLException {
        String query = "select * from CUDAN";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<CuDan> dsCuDan = new ArrayList<>();
        try {
            while (rs.next()) {
                CuDan cd = new CuDan();
                cd.setMaCuDan(rs.getString(1));
                cd.setTenCuDan(rs.getString(2));
                cd.setNgaySinh(rs.getString(3));
                cd.setGioiTinh(rs.getBoolean(4));
                cd.setSoDT(rs.getString(5));
                cd.setSoCMT(rs.getString(6));
                cd.setQueQuan(rs.getString(7));

                dsCuDan.add(cd);
            }
        } catch (SQLException e) {
            System.out.println("Error in QuanLyCuDanDAL: " + e.getMessage());
        }
        return dsCuDan;
    }

    public static void updateCD_DAL(CuDan cd) {
        try {
            ConnectSQL.connect().createStatement().executeUpdate("update CUDAN set \n"
                    + "TenCuDan=N'" + cd.getTenCuDan() + "', NgaySinh='" + cd.getNgaySinh() + "',\n"
                    + "GioiTinh='" + cd.isGioiTinh() + "',SoDT='" + cd.getSoDT() + "',\n"
                    + "SoCMT='" + cd.getSoCMT() + "',QueQuan=N'" + cd.getQueQuan() + "' \n"
                    + "where MaCuDan='" + cd.getMaCuDan() + "'");
        } catch (SQLException e) {
            System.out.println("Error in updateCD_DAL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Nhập sai ngày tháng. (VD:2000-01-01)", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //End TabQuanLyCuDan

    //Begin TabThongTinCanho
    public static List<CuDan> dsCuDan1() throws SQLException {
        String query = "select * from CUDAN";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<CuDan> dsCuDan = new ArrayList<>();
        try {
            while (rs.next()) {
                CuDan cd = new CuDan();
                cd.setMaCuDan(rs.getString(1));
                cd.setTenCuDan(rs.getString(2));
                cd.setNgaySinh(rs.getString(3));
                cd.setGioiTinh(rs.getBoolean(4));
                cd.setSoDT(rs.getString(5));
                cd.setSoCMT(rs.getString(6));
                cd.setQueQuan(rs.getString(7));
                dsCuDan.add(cd);
            }
        } catch (SQLException e) {
            System.out.println("Error in QuanLyCuDanDAL: " + e.getMessage());
        }
        return dsCuDan;
    }
    
    public static void insertCD_DAL(CuDan cd) throws SQLException {
        try {
            String query = "insert CUDAN values ('" + cd.getMaCuDan() + "',N'" + cd.getTenCuDan() + "',"
                    + "'" + cd.getNgaySinh() + "',N'" + cd.isGioiTinh() + "','" + cd.getSoDT() + "','" + cd.getSoCMT() + "',N'" + cd.getQueQuan() + "')";
            ConnectSQL.connect().createStatement().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error in insertCD_DAL: " + e.getMessage()+cd.getMaCuDan());
        }
    }
    //End TabThongTinCanho
    
}

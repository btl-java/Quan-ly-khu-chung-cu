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

    public static List<CuDan> dsCuDan() throws SQLException {
        String query = "select cd.MaCuDan,cd.TenCuDan,cd.NgaySinh,cd.GioiTinh,cd.SoDT,cd.SoCMT,cd.QueQuan,ch.MaCanHo \n"
                + "from CUDAN cd inner join CANHO ch on cd.MaCuDan=ch.MaCuDan";
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
                cd.setMaCanHo(rs.getString(8));

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
            JOptionPane.showMessageDialog(null, "Nhập sai ngày tháng. (VD:2000-01-01) \n"+e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

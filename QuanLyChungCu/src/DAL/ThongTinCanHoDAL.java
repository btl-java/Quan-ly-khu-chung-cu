/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.CanHo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quocc
 */
public class ThongTinCanHoDAL {

    public static List<CanHo> dsCanHo() throws SQLException {
        String query = "select MaCanHo,DienTich,Gia,SoPhong,MaKhu from CANHO where TrangThai=0";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<CanHo> dsCanHo = new ArrayList<CanHo>();
        try {
            while (rs.next()) {
                CanHo ch = new CanHo();
                ch.setMaCanHo(rs.getString(1));
                ch.setDienTich(rs.getFloat(2));
                ch.setGia(rs.getLong(3));
                ch.setSoPhong(rs.getInt(4));
                ch.setMaKhu(rs.getString(5));
                dsCanHo.add(ch);
            }
        } catch (SQLException e) {
            System.out.println("Error in ThongTinCanHoDAL: "+e.getMessage());
        }
        return dsCanHo;
    }
    public static void updateCH_DAL(String mach,String macd){
            try {
                String query="update CANHO set TrangThai=1, MaCuDan='"+macd+"'"
                        + "where MaCanHo='"+mach+"'";
                ConnectSQL.connect().createStatement().executeUpdate(query);
            } catch (SQLException e) {
                System.out.println("Error in updateCH_DAL: "+e.getMessage());
            }
    }
}

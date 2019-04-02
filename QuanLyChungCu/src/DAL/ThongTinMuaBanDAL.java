package DAL;

import Entities.HopDong;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quocc
 */
public class ThongTinMuaBanDAL {

    public static List<HopDong> dsHopDong() throws SQLException {
        String query = "select hd.MaHopDong,hd.MaCanHo,hd.MaCuDan,hd.DiaChiKH,ch.Gia,hd.NgayGiaoDich \n"
                + "from HOPDONG hd inner join CANHO ch \n"
                + "on hd.MaCuDan=ch.MaCuDan";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<HopDong> dsHopDong = new ArrayList<>();
        try {
            while (rs.next()) {
                HopDong hd = new HopDong();
                hd.setMaHopDong(rs.getString(1));
                hd.setMaCanHo(rs.getString(2));
                hd.setMaCuDan(rs.getString(3));
                hd.setDiaChiKhachHang(rs.getString(4));
                hd.setGia(rs.getInt(5));
                hd.setNgayGiaoDich(rs.getString(6));

                dsHopDong.add(hd);
            }
        } catch (SQLException e) {
            System.out.println("Error in ThongTinMuaBanDAL: " + e.getMessage());
        }
        return dsHopDong;
    }
    
    public static List<HopDong> dsHopDong1() throws SQLException {
        String query = "select * from HOPDONG";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<HopDong> dsHopDong = new ArrayList<>();
        try {
            while (rs.next()) {
                HopDong hd = new HopDong();
                hd.setMaHopDong(rs.getString(1));
                hd.setMaCanHo(rs.getString(5));
                hd.setMaCuDan(rs.getString(4));
                hd.setDiaChiKhachHang(rs.getString(3));
                hd.setNgayGiaoDich(rs.getString(2));

                dsHopDong.add(hd);
            }
        } catch (SQLException e) {
            System.out.println("Error in ThongTinMuaBanDAL1: " + e.getMessage());
        }
        return dsHopDong;
    }
    
    public static void insertHD_DAL(HopDong hd){
        try {
            String query="insert HOPDONG values ('"+hd.getMaHopDong()+"','"
                    +hd.getNgayGiaoDich()+"','"+hd.getDiaChiKhachHang()+"',"
                    + "'"+hd.getMaCuDan()+"','"+hd.getMaCanHo()+"')";
            ConnectSQL.connect().createStatement().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error in insertHD_DAL: " + e.getMessage());
        }
    }
}

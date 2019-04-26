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
        String query = "select hd.MaHopDong,cd.TenCuDan,hd.MaCanHo,hd.MaCuDan,hd.DiaChiKH,ch.Gia,hd.NgayGiaoDich \n"
                + "from HOPDONG hd inner join CANHO ch on hd.MaCuDan=ch.MaCuDan \n"
                + "inner join CUDAN cd on hd.MaCuDan=cd.MaCuDan";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<HopDong> dsHopDong = new ArrayList<>();
        try {
            while (rs.next()) {
                HopDong hd = new HopDong();
                hd.setMaHopDong(rs.getString(1));
                hd.setTenKH(rs.getString(2));
                hd.setMaCanHo(rs.getString(3));
                hd.setMaCuDan(rs.getString(4));
                hd.setDiaChiKhachHang(rs.getString(5));
                hd.setGia(rs.getInt(6));
                hd.setNgayGiaoDich(rs.getString(7));

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
                hd.setNgayGiaoDich(rs.getString(2));
                hd.setDiaChiKhachHang(rs.getString(3));
                hd.setMaCuDan(rs.getString(4));
                hd.setMaCanHo(rs.getString(5));
                
                dsHopDong.add(hd);
            }
        } catch (SQLException e) {
            System.out.println("Error in ThongTinMuaBanDAL_1: " + e.getMessage());
        }
        return dsHopDong;
    }
    
    public static void insertHD_DAL(String mahd,String ngaygd,String diachikh,String macd,String mach,String tenkh){
        try {
            String query="insert HOPDONG values ('"+mahd+"','"
                    +ngaygd+"',N'"+diachikh+"',"
                    + "'"+macd+"','"+mach+"',N'"+tenkh+"')";
            ConnectSQL.connect().createStatement().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error in insertHD_DAL: " + e.getMessage());
        }
    }
    
    public static List<HopDong> TimKiem_DAL(String info) throws SQLException {
        String query = "select * from HOPDONG where MaHopDong like '%"+info+"%' or NgayGiaodich like '%"+info+"%'"
                + "or DiaChiKH like '%"+info+"%' or MaCuDan like '%"+info+"%' or MaCanHo like '%"+info+"%' or TenCuDan like '%"+info+"%'";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<HopDong> dsHopDong = new ArrayList<>();
        try {
            while (rs.next()) {
                HopDong hd = new HopDong();
                hd.setMaHopDong(rs.getString(1));
                hd.setNgayGiaoDich(rs.getString(2));
                hd.setDiaChiKhachHang(rs.getString(3));
                hd.setMaCuDan(rs.getString(4));
                hd.setMaCanHo(rs.getString(5));
                
                dsHopDong.add(hd);
            }
        } catch (SQLException e) {
            System.out.println("Error in ThongTinMuaBanDAL_1: " + e.getMessage());
        }
        return dsHopDong;
    }
}

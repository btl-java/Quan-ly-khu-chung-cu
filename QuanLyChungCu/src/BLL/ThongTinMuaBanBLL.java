/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static DAL.ThongTinMuaBanDAL.BangThongTinMuaBan;
import Entities.HopDong;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author quocc
 */
public class ThongTinMuaBanBLL {

    public static List<HopDong> dsHopDong() {

        List<HopDong> dsHopDong = new ArrayList<>();
        try {
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            Date date = BangThongTinMuaBan().getDate(6);
            String formatDate = dateFormat.format(date);
            
            
                HopDong hd = new HopDong();
                hd.setMaHopDong(BangThongTinMuaBan().getString(1));
                hd.setMaCanHo(BangThongTinMuaBan().getString(2));
                hd.setMaCuDan(BangThongTinMuaBan().getString(3));
                hd.setDiaChiKhachHang(BangThongTinMuaBan().getString(4));
                hd.setGia(BangThongTinMuaBan().getInt(5));
                hd.setNgayGiaoDich(BangThongTinMuaBan().getString(6));
                
                dsHopDong.add(hd);
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return dsHopDong;
    }

    public static void HienThongTinMuaBan(JTable tbl) throws Exception{
        
        List<HopDong> dsHopDong = dsHopDong();
        Object[] colName = new Object[]{"Mã hợp đồng", "Mã căn hộ", "Mã cư dân", "Địa chỉ KH", "Giá", "Ngày giao dịch"};
        Object[][] data = new Object[dsHopDong.size()][6];
        int i = 0;
        for (HopDong hd : dsHopDong) {
            data[i][0] = hd.getMaHopDong();
            data[i][1] = hd.getMaCanHo();
            data[i][2] = hd.getMaCuDan();
            data[i][3] = hd.getDiaChiKhachHang();
            data[i][4] = hd.getGia();
            data[i][5] = hd.getNgayGiaoDich();
            i++;
        }
        TableModel tableModel = new DefaultTableModel(data, colName);
        tbl.setModel(tableModel);
    }
}

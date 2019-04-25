/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static DAL.ThongTinMuaBanDAL.insertHD_DAL;
import Entities.HopDong;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author quocc
 */
public class ThongTinMuaBanBLL {

    public static void HienThongTinMuaBan(JTable tbl) throws Exception {

        List<HopDong> dsHopDong = DAL.ThongTinMuaBanDAL.dsHopDong();
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
    
    public static void insertHD_BLL(String mahd,String ngaygd,String diachikh,String macd,String mach){
        insertHD_DAL(mahd,ngaygd,diachikh,macd,mach);
    }
}

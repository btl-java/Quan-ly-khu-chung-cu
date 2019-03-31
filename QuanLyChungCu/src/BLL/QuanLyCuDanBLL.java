/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static DAL.QuanLyCuDanDAL.BangThongTinCuDan;
import Entities.CuDan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author quocc
 */
public class QuanLyCuDanBLL {

    public static List<CuDan> dsCuDan() {

        List<CuDan> dsCuDan = new ArrayList<>();
        try {
            CuDan cd = new CuDan();
            cd.setMaCuDan(BangThongTinCuDan().getString(1));
            cd.setTenCuDan(BangThongTinCuDan().getString(2));
            cd.setNgaySinh(BangThongTinCuDan().getString(3));
            cd.setGioiTinh(BangThongTinCuDan().getBoolean(4));
            cd.setSoDT(BangThongTinCuDan().getString(5));
            cd.setSoCMT(BangThongTinCuDan().getString(6));
            cd.setQueQuan(BangThongTinCuDan().getString(7));
            cd.setMaCanHo(BangThongTinCuDan().getString(8));

            dsCuDan.add(cd);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return dsCuDan;
    }

    public static void HienThongTinCuDan(JTable tbl) {
        List<CuDan> dsCuDan = dsCuDan();
        Object[] colName = new Object[]{"Mã cư dân", "Tên cư dân", "Ngày sinh", "Giới tính", "SĐT", "Số CMT", "Quê quán", "Mã căn hộ"};
        Object[][] data = new Object[dsCuDan.size()][8];
        int i = 0;
        for (CuDan cd : dsCuDan) {
            data[i][0] = cd.getMaCuDan();
            data[i][1] = cd.getTenCuDan();
            data[i][2] = cd.getNgaySinh();
            
            if(cd.isGioiTinh()==true){
                data[i][3] = "Nam";
            }
            else data[i][3] = "Nữ";
            
            data[i][4] = cd.getSoDT();
            data[i][5] = cd.getSoCMT();
            data[i][6] = cd.getQueQuan();
            data[i][7] = cd.getMaCanHo();
            i++;
        }
        TableModel tableModel = new DefaultTableModel(data, colName);
        tbl.setModel(tableModel);
    }
    
   public static void updateCD_BLL(JTextField macd,JTextField tencd,JTextField ngsinh,JComboBox gioitinh,JTextField sdt,JTextField quequan,JTextField socmt){
       List<CuDan> dsCuDan=dsCuDan();
       boolean flag=false;
       for(CuDan cd:dsCuDan){
           if(cd.getMaCuDan().equals(macd.getText())){
               flag=true; break;
           }
       }
       
       if(!flag || macd.getText()==null){
           JOptionPane.showMessageDialog(null, "Chọn mã cư dân.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
           //boolean gt = false;
           if(gioitinh.getSelectedItem().toString().equals("Nữ")){
               gioitinh.setSelectedItem("false");
           }
           else gioitinh.setSelectedItem("true");
           CuDan cd=new CuDan(macd.getText(),tencd.getText(),ngsinh.getText(),Boolean.parseBoolean(gioitinh.getSelectedItem().toString()), sdt.getText(),socmt.getText(),quequan.getText());
           DAL.QuanLyCuDanDAL.updateCD_DAL(cd);
       }
   }
}

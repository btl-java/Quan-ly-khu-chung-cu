/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static DAL.QuanLyCuDanDAL.dsCuDan1;
import Entities.CuDan;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
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

    public static void HienThongTinCuDan(JTable tbl) throws SQLException {
        List<CuDan> dsCuDan = DAL.QuanLyCuDanDAL.dsCuDan();
        Object[] colName = new Object[]{"Mã cư dân", "Tên cư dân", "Ngày sinh", "Giới tính", "SĐT", "Số CMT", "Quê quán", "Mã căn hộ"};
        Object[][] data = new Object[dsCuDan.size()][8];
        int i = 0;
        for (CuDan cd : dsCuDan) {
            data[i][0] = cd.getMaCuDan();
            data[i][1] = cd.getTenCuDan();
            data[i][2] = cd.getNgaySinh();
            if (cd.isGioiTinh() == true) {
                data[i][3] = "Nam";
            } else {
                data[i][3] = "Nữ";
            }
            data[i][4] = cd.getSoDT();
            data[i][5] = cd.getSoCMT();
            data[i][6] = cd.getQueQuan();
            data[i][7] = cd.getMaCanHo();
            i++;
        }
        TableModel tableModel = new DefaultTableModel(data, colName);
        tbl.setModel(tableModel);
    }

    public static void updateCD_BLL(JTextField macd, JTextField tencd, JTextField ngsinh, JComboBox gioitinh, JTextField sdt, JTextField socmt, JTextField quequan) throws SQLException, ParseException {
        List<CuDan> dsCuDan = DAL.QuanLyCuDanDAL.dsCuDan();
        boolean flag = false;

        for (CuDan cd : dsCuDan) {
            if (cd.getMaCuDan().equals(macd.getText())) {
                flag = true;
                break;
            }
        }

        if (!flag || macd.getText() == null) {
            JOptionPane.showMessageDialog(null, "Chọn mã cư dân.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //set gioitinh
            boolean gt = false;
            gt = gioitinh.getSelectedItem().toString().equals("Nam");

            CuDan cd = new CuDan(macd.getText(), tencd.getText(), ngsinh.getText(), gt, sdt.getText(), socmt.getText(), quequan.getText());
            DAL.QuanLyCuDanDAL.updateCD_DAL(cd);
        }
    }

    //Begin TabThongTinCanho
    public static void insertCD_BLL(String macd,JTextField tencd, JTextField ngsinh, JComboBox gioitinh, JTextField sdt, JTextField socmt, JTextField quequan) throws SQLException {
        try {
//            for (CuDan cd : dsCuDan) {
//                if (cd.getMaCuDan().equals(macd)) {
//                    macd = String.valueOf(Integer.parseInt(macd) + 1);
//                } 
//            }

            boolean gt =false;
            gt=gioitinh.getSelectedItem().toString().equals("Nam");
            CuDan cd = new CuDan(macd, tencd.getText(), ngsinh.getText(), gt, sdt.getText(), socmt.getText(), quequan.getText());
            
            DAL.QuanLyCuDanDAL.insertCD_DAL(cd);
        } catch (HeadlessException | SQLException e) {
            System.out.println("Errors in insertCD_BLL: " + e.getMessage() + macd);
        }
    }
    
     
    public static ComboBoxModel cmb_BLL() throws SQLException{
        StringBuilder items=new StringBuilder();
        for(CuDan cd: dsCuDan1()){
            items.append(cd.getMaCuDan());
            items.append(",");
        }
        return new DefaultComboBoxModel(items.toString().split(","));
    }
    
    //End TabThongTinCanho
}

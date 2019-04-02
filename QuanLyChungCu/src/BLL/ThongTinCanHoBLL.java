/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static DAL.ThongTinCanHoDAL.dsCanHo;
import Entities.CanHo1;
import Entities.CuDan;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author quocc
 */
public class ThongTinCanHoBLL {

    public static void HienThongTinCanho(JTable tbl) throws SQLException{
        List<CanHo1> dsCanHo=dsCanHo();
        Object[] colName=new Object[]{"Mã căn hộ","Diện tích","Giá","Số phòng","Mã khu"};
        Object[][] data=new Object[dsCanHo.size()][5];
        int i=0;
        for(CanHo1 ch: dsCanHo){
            data[i][0]=ch.getMaCanHo();
            data[i][1]=ch.getDienTich();
            data[i][2]=ch.getGia();
            data[i][3]=ch.getSoPhong();
            data[i][4]=ch.getMaKhu();
            i++;
        }
        
        TableModel tableModel=new DefaultTableModel(data, colName);
        tbl.setModel(tableModel);
    }
}

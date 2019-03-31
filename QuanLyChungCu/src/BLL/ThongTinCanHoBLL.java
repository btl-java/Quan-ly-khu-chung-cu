/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import static DAL.ThongTinCanHoDAL.BangThongTinCanHo;
import Entities.CanHo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author quocc
 */
public class ThongTinCanHoBLL {
    public static List<CanHo> dsCanHo(){
        List<CanHo> dsCanHo=new ArrayList<>();
        try {
            CanHo ch=new CanHo();
            ch.setMaCanHo(BangThongTinCanHo().getString(1));
            ch.setMaCanHo(BangThongTinCanHo().getString(2));
            ch.setMaCanHo(BangThongTinCanHo().getString(3));
            ch.setMaCanHo(BangThongTinCanHo().getString(4));
            ch.setMaCanHo(BangThongTinCanHo().getString(5));
            
            dsCanHo.add(ch);
        } catch (SQLException e) {
            System.out.println("Error in ThongTinCanHoBLL: "+e.getMessage());
        }
        return dsCanHo;
    }
    
    public static void HienThongTinCanho(JTable tbl){
        List<CanHo> chs=dsCanHo();
        Object[] colName=new Object[]{"Mã căn hộ","Diện tích","Giá","Số phòng","Mã khu"};
        Object[][] data=new Object[dsCanHo().size()][5];
        int i=0;
        for(CanHo ch:dsCanHo()){
            data[i][0]=ch.getMaCanHo();
            data[i][1]=ch.getMaCanHo();
            data[i][2]=ch.getMaCanHo();
            data[i][3]=ch.getMaCanHo();
            data[i][4]=ch.getMaCanHo();
            i++;
        }
    }
}

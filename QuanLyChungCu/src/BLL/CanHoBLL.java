
package BLL;
import DAL.CanHoDAL;
import Entities.*;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableModel;

public class CanHoBLL {
    private CanHoBLL(){
        
    }

    public static TableModel show(){
        
        ArrayList<CanHo> list = CanHoDAL.show();
        String[] columnNames = {"Mã Căn Hộ","Diện Tích","Giá","Trạng Thái","Số Phòng","Mã Cư Dân","Mã Khu"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(CanHo c : list){
            data[row][0] = c.getMaCanHo();
            data[row][1] = c.getDienTich();
            data[row][2] = c.getGia();
            data[row][3] = c.isTrangThai();
            data[row][4] = c.getSoPhong();
            data[row][5] = c.getMaCuDan();
            data[row][6] = c.getMaKhu();
            row++;
        }
        
        return new DefaultTableModel(data, columnNames);
    }
    
    public static ComboBoxModel cbb_show(){
         
       StringBuilder items = new StringBuilder();
       for(CanHo c: CanHoDAL.show()){
           items.append(c.getMaCanHo());
           items.append("#");
       }
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
    
    public static boolean update(String maCanHo,long gia,int soPhong){
        return CanHoDAL.update(maCanHo, gia, soPhong);
    }
    
    public static TableModel search(String text){
         ArrayList<CanHo> list = CanHoDAL.search(text);
        String[] columnNames = {"Mã Căn Hộ","Diện Tích","Giá","Trạng Thái","Số Phòng","Mã Cư Dân","Mã Khu"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(CanHo c : list){
            data[row][0] = c.getMaCanHo();
            data[row][1] = c.getDienTich();
            data[row][2] = c.getGia();
            data[row][3] = c.isTrangThai();
            data[row][4] = c.getSoPhong();
            data[row][5] = c.getMaCuDan();
            data[row][6] = c.getMaKhu();
            row++;
        }
        
        return new DefaultTableModel(data, columnNames);
    }
}

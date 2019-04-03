
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
        String[] columnNames = {"STT","Mã Căn Hộ","Diện Tích","Giá","Trạng Thái","Số Phòng","Mã Cư Dân","Mã Khu"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(CanHo c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaCanHo();
            data[row][2] = c.getDienTich();
            data[row][3] = c.getGia();
            data[row][4] = c.isTrangThai();
            data[row][5] = c.getSoPhong();
            data[row][6] = c.getMaCuDan();
            data[row][7] = c.getMaKhu();
            row++;
        }
        
        //DefaultTableModel table = new DefaultTableModel(new Object[]{"Check"},10);
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0 :return Integer.class;
                    case 1: return String.class;
                    case 2: return Float.class;
                    case 3: return Long.class;
                    case 4: return Boolean.class; //tạo checkbox cho cột này
                    case 5: return Integer.class;
                    case 6: return String.class;
                    default: return String.class;
                }
            };
        };
        
       return table;
        
       // return new DefaultTableModel(data, columnNames);
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
    
    public static TableModel search(String cbbValue,boolean check){
        ArrayList<CanHo> list = CanHoDAL.search(cbbValue,check);
        String[] columnNames = {"STT","Mã Căn Hộ","Diện Tích","Giá","Trạng Thái","Số Phòng","Mã Cư Dân","Mã Khu"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(CanHo c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaCanHo();
            data[row][2] = c.getDienTich();
            data[row][3] = c.getGia();
            data[row][4] = c.isTrangThai();
            data[row][5] = c.getSoPhong();
            data[row][6] = c.getMaCuDan();
            data[row][7] = c.getMaKhu();
            row++;
        }
        
             DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0 :return Integer.class;
                    case 1: return String.class;
                    case 2: return Float.class;
                    case 3: return Long.class;
                    case 4: return Boolean.class; // Tạo checkbox cho cột này
                    case 5: return Integer.class;
                    case 6: return String.class;
                    default: return String.class;
                }
            };
        };
        
       return table;
    }
    
    
}

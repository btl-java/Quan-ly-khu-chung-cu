/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.*;
import Entities.*;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author PhamDai
 */
public class KhuCanHoBLL {

    private KhuCanHoBLL() {
    }
    
    public static TableModel show(){
        ArrayList<KhuCanHo> list = KhuCanHoDAL.show();
        
        String[] columnNames = {"Mã Khu","Tên Khu","Số Tầng","Số căn/tầng","Địa chỉ"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i =0;
        
        for(KhuCanHo khu : list){
            data[i][0] = khu.getMaKhu();
            data[i][1] = khu.getTenKhu();
            data[i][2] = khu.getSoTang();
            data[i][3] = khu.getSoCanTT();
            data[i][4] = khu.getDiaChi();
            i++;
        }
       // TableModel
        return new DefaultTableModel(data, columnNames);
    }
    
    public static ComboBoxModel cbb_show(){
        
        StringBuilder items = new StringBuilder();
        for(int i = 0;i<KhuCanHoDAL.show().size();i++){
            items.append(KhuCanHoDAL.show().get(i).getMaKhu());
            items.append("#");
        }
        
        //String[] cbbitem = items.toString().split("#");
        //DefaultComboBoxModel model = new DefaultComboBoxModel(items.toString().split("#"));
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
    
    
    
    
}

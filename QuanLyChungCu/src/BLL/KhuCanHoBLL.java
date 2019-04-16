/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAL.*;
import Entities.*;
import java.sql.SQLException;
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
        
        String[] columnNames = {"STT","Mã Khu","Tên Khu","Số Tầng","Số căn/tầng","Địa chỉ"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i = 0;
        
        for(KhuCanHo khu : list){
            data[i][0] = i + 1;
            data[i][1] = khu.getMaKhu();
            data[i][2] = khu.getTenKhu();
            data[i][3] = khu.getSoTang();
            data[i][4] = khu.getSoCanTT();
            data[i][5] = khu.getDiaChi();
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
    
    public static boolean insert( String maKhu, String tenKhu,int soTang,int soCanTT, String diaChi, float dienTich, long gia,int soPhong){
        
        if(KhuCanHoDAL.insert(new KhuCanHo(maKhu, tenKhu, soTang, soCanTT, diaChi))){
            System.out.println("Thêm khu thành công");
        }// thêm và check thêm khu
         
        ArrayList<CanHo> list = new ArrayList<>();
        
        for(int i = 1;i<=soTang;i++) {
            for(int j=1;j<=soCanTT;j++) {		
		if(i<10 && j<10) {
        
                    list.add(new CanHo(maKhu+"0"+i+"0"+j, dienTich, gia, false, soPhong,null, maKhu));
                    
		} else if (i <10) {
                    
                    list.add(new CanHo(maKhu+"0"+i+j, dienTich, gia, false, soPhong,null, maKhu)); 
                    
		} else if (j<10) {
                    
                    list.add(new CanHo(maKhu+i+"0"+j, dienTich, gia, false, soPhong,null, maKhu));
                    
		} else {
                    
                    list.add(new CanHo(maKhu+i+j, dienTich, gia, false, soPhong,null, maKhu));
                    
		}
            }		
	}
        
        return CanHoDAL.inserts(list);
    }
    
    public static TableModel search(String text) throws SQLException{
        
        ArrayList<KhuCanHo> list = KhuCanHoDAL.search(text);
        
        String[] columnNames = {"STT","Mã Khu","Tên Khu","Số Tầng","Số căn/tầng","Địa chỉ"};
        
        Object[][] data = new Object[list.size()][columnNames.length];
        
        int i =0;
        
        for(KhuCanHo khu : list){
            data[i][0] = i + 1;
            data[i][1] = khu.getMaKhu();
            data[i][2] = khu.getTenKhu();
            data[i][3] = khu.getSoTang();
            data[i][4] = khu.getSoCanTT();
            data[i][5] = khu.getDiaChi();
            i++;
        }
       // TableModel
        return new DefaultTableModel(data, columnNames);
    }
    
    public static boolean update(String maKhu,String tenKhu,String diaChi){
        return KhuCanHoDAL.update(maKhu, tenKhu, diaChi);
    }
    
    public static boolean delete(String maKhu){
        return KhuCanHoDAL.delete(maKhu);
    } 
    
}

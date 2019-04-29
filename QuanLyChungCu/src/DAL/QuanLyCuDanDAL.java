/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entities.CuDan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author quocc
 */
public class QuanLyCuDanDAL {
    
    //Begin TabQuanLyCuDan
    public static List<CuDan> dsCuDan() throws SQLException {
        String query = "select * from CUDAN";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<CuDan> dsCuDan = new ArrayList<>();
        try {
            while (rs.next()) {
                CuDan cd = new CuDan();
                cd.setMaCuDan(rs.getString(1));
                cd.setTenCuDan(rs.getString(2));
                cd.setNgaySinh(rs.getString(3));
                cd.setGioiTinh(rs.getBoolean(4));
                cd.setSoDT(rs.getString(5));
                cd.setSoCMT(rs.getString(6));
                cd.setQueQuan(rs.getString(7));

                dsCuDan.add(cd);
            }
        } catch (SQLException e) {
            System.out.println("Error in QuanLyCuDanDAL: " + e.getMessage());
        }
        return dsCuDan;
    }

    public static void updateCD_DAL(CuDan cd) {
        try {
            ConnectSQL.connect().createStatement().executeUpdate("update CUDAN set \n"
                    + "TenCuDan=N'" + cd.getTenCuDan() + "', NgaySinh='" + cd.getNgaySinh() + "',\n"
                    + "GioiTinh='" + cd.isGioiTinh() + "',SoDT='" + cd.getSoDT() + "',\n"
                    + "SoCMT='" + cd.getSoCMT() + "',QueQuan=N'" + cd.getQueQuan() + "' \n"
                    + "where MaCuDan='" + cd.getMaCuDan() + "'");
        } catch (SQLException e) {
            System.out.println("Error in updateCD_DAL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Nhập sai ngày tháng. (VD:2000-01-01)", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //End TabQuanLyCuDan

    //Begin TabThongTinCanho
    public static List<CuDan> dsCuDan1() throws SQLException {
        String query = "select * from CUDAN";
        ResultSet rs = ConnectSQL.connect().createStatement().executeQuery(query);
        List<CuDan> dsCuDan = new ArrayList<>();
        try {
            while (rs.next()) {
                CuDan cd = new CuDan();
                cd.setMaCuDan(rs.getString(1));
                cd.setTenCuDan(rs.getString(2));
                cd.setNgaySinh(rs.getString(3));
                cd.setGioiTinh(rs.getBoolean(4));
                cd.setSoDT(rs.getString(5));
                cd.setSoCMT(rs.getString(6));
                cd.setQueQuan(rs.getString(7));
                dsCuDan.add(cd);
            }
        } catch (SQLException e) {
            System.out.println("Error in QuanLyCuDanDAL: " + e.getMessage());
        }
        return dsCuDan;
    }
    
    public static void insertCD_DAL(CuDan cd) throws SQLException {
        try {
            String query = "insert CUDAN values ('" + cd.getMaCuDan() + "',N'" + cd.getTenCuDan() + "',"
                    + "'" + cd.getNgaySinh() + "',N'" + cd.isGioiTinh() + "','" + cd.getSoDT() + "','" + cd.getSoCMT() + "',N'" + cd.getQueQuan() + "')";
            ConnectSQL.connect().createStatement().executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error in insertCD_DAL: " + e.getMessage()+cd.getMaCuDan());
        }
    }
    //End TabThongTinCanho
    
    
    /**
     * 
     * @author Do
     * @return 
     */
    
    public static int xuLyXoaCuDan(String maCuDan){
        try {
            String sql="delete from CUDAN where MaCuDan=?";
            PreparedStatement preStatement= ConnectSQL.connect().prepareStatement(sql);
            preStatement.setString(1,maCuDan);
            preStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    public static void xuLyTimKiem(String tenCuDan, String maCuDan){
        ArrayList<CuDan> dsCuDan= new ArrayList<>();
        try {
              String sql="select * from CUDAN where TenCuDan=? or MaCuDan=? ";
            PreparedStatement preStatement =DAL.ConnectSQL.connect().prepareStatement(sql);
            preStatement.setString(1,tenCuDan);
            preStatement.setString(2,maCuDan);
            ResultSet result=preStatement.executeQuery();
            while(result.next()){
                 CuDan cd = new CuDan();
                cd.setMaCuDan(result.getString(1));
                cd.setTenCuDan(result.getString(2));
                cd.setNgaySinh(result.getString(3));
                cd.setGioiTinh(result.getBoolean(4));
                cd.setSoDT(result.getString(5));
                cd.setSoCMT(result.getString(6));
                cd.setQueQuan(result.getString(7));
                dsCuDan.add(cd);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
     public static boolean kiemTraTonTai(String maCuDan){
         try {
             String sql="select * from CUDAN where MaCuDan=?";
             PreparedStatement preStatement=ConnectSQL.connect().prepareStatement(sql);
             preStatement.setString(1, maCuDan);
             ResultSet result=preStatement.executeQuery();
             return result.next();  
         } catch (Exception e) {
         }
        return false;
     }
   public int themCuDan(CuDan cuDan){
       try {
           String sql="insert into CUDAN values(?,?,?,?,?,?,?)";
           PreparedStatement preStatement=ConnectSQL.connect().prepareStatement(sql);
           preStatement.setString(1, cuDan.getMaCuDan());
           preStatement.setString(2, cuDan.getTenCuDan());
           preStatement.setString(3, cuDan.getNgaySinh());
           preStatement.setBoolean(4, cuDan.isGioiTinh());
           preStatement.setString(5, cuDan.getSoDT());
           preStatement.setString(6, cuDan.getSoCMT());
           preStatement.setString(7, cuDan.getQueQuan());
           return preStatement.executeUpdate();
       }
        catch(SQLException e2) {
                JOptionPane.showMessageDialog(null, "Dữ liệu không được để trống");
        }
        catch(NullPointerException e2) {
                JOptionPane.showMessageDialog(null, "Dữ liệu không được để trống");
        }
        catch(NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "Dữ liệu không chính xác, mời nhập lại .");
        }
       catch (Exception e) {
           e.printStackTrace();
       }
        return -1;
   }
   public int updateCuDan(CuDan cuDan){
       try {
           String sql="update CUDAN set TenCuDan=?,NgaySinh=?,GioiTinh=?,SoDT=?,SoCMT=?,QueQuan=? where MaCuDan=?";
           PreparedStatement preStatement=ConnectSQL.connect().prepareStatement(sql);
           preStatement.setString(1, cuDan.getTenCuDan());
           preStatement.setString(2, cuDan.getNgaySinh());
           preStatement.setBoolean(3, cuDan.isGioiTinh());
           preStatement.setString(4, cuDan.getSoDT());
           preStatement.setString(5, cuDan.getSoCMT());
           preStatement.setString(6, cuDan.getQueQuan());
            preStatement.setString(7, cuDan.getMaCuDan());
           return preStatement.executeUpdate();
          
       } 
       catch(SQLException e2) {
                JOptionPane.showMessageDialog(null, "Dữ liệu không được để trống");
        }
        catch(NullPointerException e2) {
                JOptionPane.showMessageDialog(null, "Dữ liệu không được để trống");
        }
        catch(NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "Dữ liệu không chính xác, mời nhập lại .");
        }
       catch (Exception e) {
           e.printStackTrace();
       }
        return -1;
}
   public static List<CuDan> layMaCuDan(){
       List<CuDan> listCuDan= new ArrayList<>();
       try {
           String sql="select MaCuDan from CUDAN ";
           Statement statement=ConnectSQL.connect().createStatement();
           ResultSet resultSet=statement.executeQuery(sql);
           while(resultSet.next()){
               CuDan cuDan= new CuDan();
               cuDan.setMaCuDan(resultSet.getString(1));
               listCuDan.add(cuDan);
           }
           
       } catch (Exception e) {
           e.printStackTrace();
       }
        return listCuDan;
   
   }
}

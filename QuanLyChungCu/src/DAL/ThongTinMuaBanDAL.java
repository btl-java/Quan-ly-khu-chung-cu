
package DAL;

import java.sql.*;

/**
 *
 * @author quocc
 */
public class ThongTinMuaBanDAL {
    
    public static  ThongTinMuaBanDAL instance;
    
    private ThongTinMuaBanDAL(){}
    
    public ThongTinMuaBanDAL getInstance(){
        if(instance==null) instance=new ThongTinMuaBanDAL();
        return instance;
    }
    
    static Connection connection=ConnectSQL.connect();
    static Statement statement;
    static ResultSet rs;
    
    public static ResultSet BangThongTinMuaBan() throws SQLException{
        String query="select hd.MaHopDong,hd.MaCanHo,hd.MaCuDan,hd.DiaChiKH,ch.Gia,hd.NgayGiaoDich \n" +
                        "from HOPDONG hd inner join CANHO ch \n" +
                        "on hd.MaCuDan=ch.MaCuDan";
        statement=connection.createStatement();
        rs=statement.executeQuery(query);
        while (rs.next()) {            
            return rs;
        }
        return null;
    }
    
//    public static void main(String[] args) throws SQLException {
//        System.out.println(BangThongTinMuaBan().getString(1));
//        System.out.println(BangThongTinMuaBan().getString(2));
//        System.out.println(BangThongTinMuaBan().getString(3));
//        System.out.println(BangThongTinMuaBan().getString(4));
//        System.out.println(BangThongTinMuaBan().getInt(5));
//        System.out.println(BangThongTinMuaBan().getString(6));
//    }
}

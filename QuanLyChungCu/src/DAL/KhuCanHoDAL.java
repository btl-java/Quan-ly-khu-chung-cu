/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PhamDai
 */
public class KhuCanHoDAL {

    public static KhuCanHoDAL instance;
    
    private KhuCanHoDAL() {
    }
    
    public KhuCanHoDAL getInstance(){
        if(instance==null) instance = new KhuCanHoDAL();
        return instance;
    }
    
    public ResultSet list(){
        return null;
    }
    
    public boolean Insert(){
           try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("insert...");
            
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
    
    public boolean Update(){
           try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("update...");
            
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }
    
    public boolean Delete(){
           try {
            PreparedStatement pre = ConnectSQL.connect().prepareStatement("delete...");
            
            return pre.executeUpdate() > 0;
            
        } catch(SQLException e){
            return false;
        }
    }    
        
}

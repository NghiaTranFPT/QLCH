/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khang
 */
public class ConnectDB {

    
     Connection con;
    String dbname;
    String user;
    String pass;
    public ConnectDB(String dbname, String user, String pass){
        this.dbname=dbname;
        this.user=user;
        this.pass=pass;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLCH","nghia","12345");
        } catch (Exception e) {
        }
    }
     public static Connection getConnection(){
   Connection con = null;
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLCH","nghia","12345");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return con;
   }
public int Login(String user, String pass){ // tro ve 0 khi login sai, 1 la ad, 2 la khach hang
    try {
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery("select * from TAI_KHOAN where ID= '"+user+"' and Pass= '"+pass+"' ");
        if(rs.next()){
            if(rs.getString(3).equals("admin"))
                return 1;
            else 
                return 2;
        }else{
            return 0;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
    
}
public int InsertProduct(Product obj ){
    try {
        Statement st = con.createStatement();
        int i=st.executeUpdate("insert into SAN_PHAM values('"+obj.getMasp()+"','"+obj.getTensp()+"','"+obj.getMota()+
                                                            "','"+obj.getSoluong()+"','"+obj.getDongia()+"','"+obj.getHinhanh()+"','"+
                                                            obj.getNhasx()+"','"+obj.getMaloai()+"')");
        st.close();
        return i;
    } catch (Exception e) {
        Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE,null,e);
        return 0;
    }

}
}
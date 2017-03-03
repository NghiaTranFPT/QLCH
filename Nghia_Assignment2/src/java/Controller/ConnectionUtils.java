/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils {
       public static Connection getConnection()
             throws ClassNotFoundException, SQLException {
     
        return  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLCH","nghia","12345");
   }
    
   public static void closeQuietly(Connection con) {
       try {
           con.close();
       } catch (Exception e) {
       }
  }
 
   public static void rollbackQuietly(Connection con) {
       try {
           con.rollback();
       } catch (Exception e) {
       }
   }
}



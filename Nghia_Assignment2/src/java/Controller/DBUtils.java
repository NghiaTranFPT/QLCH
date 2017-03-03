/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import Model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class DBUtils {
 public static Account findUser(Connection conn, String userName, String password) throws SQLException {
 
      String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a "
              + " where a.User_Name = ? and a.password= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
      pstm.setString(2, password);
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          String gender = rs.getString("Gender");
          Account user = new Account();
          user.setUsername(userName);
          user.setPass(password);
          user.setVaitro(gender);
          return user;
      }
      return null;
  }
  public static Account findUser(Connection conn, String userName) throws SQLException {
 
      String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " + " where a.User_Name = ? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
 
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          String password = rs.getString("Password");
          String gender = rs.getString("Gender");
          Account user = new Account();
          user.setUsername(userName);
          user.setPass(password);
          user.setVaitro(gender);
          return user;
      }
      return null;
  }
 
  public static List<Product> queryProduct(Connection conn) throws SQLException {
      String sql = "Select a.Code, a.Name, a.Price from SAN_PHAM a ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Product> list = new ArrayList<Product>();
      while (rs.next()) {
          String code = rs.getString("Code");
          String name = rs.getString("Name");
          float price = rs.getFloat("Price");
          Product product = new Product();
          product.setMasp(code);
          product.setTensp(name);
          product.setDongia(price);
          list.add(product);
      }
      return list;
  }
 
  public static Product findProduct(Connection conn, String code) throws SQLException {
      String sql = "Select a.Code, a.Name, a.Price from SAN_PHAM a where a.Code=?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, code);
 
      ResultSet rs = pstm.executeQuery();
 
      while (rs.next()) {
          String name = rs.getString("Name");
          float price = rs.getFloat("Price");
          Product product = new Product(code, name, price);
          return product;
      }
      return null;
  }
 
  public static void updateProduct(Connection conn, Product product) throws SQLException {
      String sql = "Update Product set Name =?, Price=? where Code=? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getTensp());
      pstm.setFloat(2, (float) product.getDongia());
      pstm.setString(3, product.getMasp());
      pstm.executeUpdate();
  }
 
  public static void insertProduct(Connection conn, Product product) throws SQLException {
      String sql = "Insert into Product(Code, Name,Price) values (?,?,?)";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getMasp());
      pstm.setString(2, product.getTensp());
      pstm.setFloat(3, (float) product.getDongia());
 
      pstm.executeUpdate();
  }
 
  public static void deleteProduct(Connection conn, String code) throws SQLException {
      String sql = "Delete Product where Code= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, code);
 
      pstm.executeUpdate();
  }
 
}


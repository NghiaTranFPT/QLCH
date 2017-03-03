/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Account;
import java.sql.Connection;
 
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyUtils {
   public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
 
   private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";
 
    
   // Lưu trữ đối tượng kết nối trong request.
   // Thông tin sẽ được lưu trũ trong  requests)
   public static void storeConnection(ServletRequest request, Connection con) {
       request.setAttribute(ATT_NAME_CONNECTION, con);
   }
 
// lấy đối tượng Connection lưu trữ trong 1 attribute của request.
   public static Connection getStoredConnection(ServletRequest request) {
      Connection con = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
       return con;
   }
 
   // Lưu thông tin user vào Session.
   public static void storeLoginedUser(HttpSession session, Account loginedUser) {
       session.setAttribute("loginedUser", loginedUser);
   }
 
   // lấy thông tin của user đã được lưu trong session.
   public static Account getLoginedUser(HttpSession session) {
       Account loginedUser = (Account) session.getAttribute("loginedUser");
       return loginedUser;
   }
 
 
   // lưu thông tin vào Cookie
   public static void storeUserCookie(HttpServletResponse response, Account user) {
       System.out.println("Store user cookie");
       Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, user.getUsername());
 
       //thông tin này tồn tại trong 1 ngày (đổi ra giây)
       cookieUserName.setMaxAge(24 * 60 * 60);
       response.addCookie(cookieUserName);
   }
 
   public static String getUserNameInCookie(HttpServletRequest request) {
       Cookie[] cookies = request.getCookies();
       if (cookies != null) {
           for (Cookie cookie : cookies) {
               if (ATT_NAME_USER_NAME.equals(cookie.getName())) {
                   return cookie.getValue();
               }
           }
       }
       return null;
   }
 
   // xoá thông tin trong cookie.
   public static void deleteUserCookie(HttpServletResponse response) {
       Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
 
       // 0 seconds (Expires immediately)
       cookieUserName.setMaxAge(0);
       response.addCookie(cookieUserName);
   }
 
}


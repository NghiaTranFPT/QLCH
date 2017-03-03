/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = { "/doCreateProduct" })
public class doCreateProductServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
 
   public doCreateProductServlet() {
       super();
   }
 
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       Connection con = MyUtils.getStoredConnection(request);
       String code = (String) request.getParameter("code");
       String name = (String) request.getParameter("name");
       String priceStr = (String) request.getParameter("price");
       float price = 0;
       try {
           price = Float.parseFloat(priceStr);
       } catch (Exception e) {
       }
       Product product = new Product(code, name, price);
 
       String errorString = null;
 
      
       // Product ID is the string literal [a-zA-Z_0-9]
       // with at least 1 character
       String regex = "\\w+";
 
       if (code == null || !code.matches(regex)) {
           errorString = "Product Code invalid!";
       }
 
//       if (errorString == null) {
//           try {
//              ConnectDB.classInsertProduct(con, product);
//           } catch (Exception e) {
//               e.printStackTrace();
//               errorString = e.getMessage();
//           }
//       }
        
       // Store infomation to request attribute, before forward to views.
       request.setAttribute("errorString", errorString);


   }

   
    }

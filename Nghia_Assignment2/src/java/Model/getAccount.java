/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author khang
 */
@WebServlet(name = "getAccount", urlPatterns = {"/getAccount"})
public class getAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static public String tentk="";
    static public String pass="";
    static public String vaitro="";
    static public String hoten="";
    static public String diachi;
    static public String sdt="";
    static public String email="";
   
    static public String ac="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ac=request.getParameter("ac");
        PrintWriter out=response.getWriter();
       switch (ac) {
           case "0":
               tentk =request.getParameter("ID");
               pass = request.getParameter("Pass");
               vaitro = request.getParameter("VaiTro");
               hoten = request.getParameter("HoTen");
               diachi = request.getParameter("DiaChi");
               sdt = request.getParameter("SoDT");
               email = request.getParameter("Email");
              
               try {
                   Statement st=Controller.ConnectDB.getConnection().createStatement();
                   ResultSet rs=st.executeQuery("select * from TAI_KHOAN where ID='"+tentk+"'");
                   if(rs.next()){
                       pass=rs.getString(2);
                       vaitro=rs.getString(3);
                       hoten=rs.getString(4);
                       diachi= rs.getString(5);
                       sdt = rs.getString(6);
                       email = rs.getString(7);
                       
                       
                   }else{
                        pass=rs.getString("");
                       vaitro=rs.getString("");
                       hoten=rs.getString("");
                       diachi= rs.getString("");
                       sdt = rs.getString("");
                       email = rs.getString("");
                       
                   }response.sendRedirect("QuantriAccount.jsp");
               } catch (SQLException ex) { 
                     out.println("Không tìm thấy tài khoản");
               }  break;
           case "1":
              tentk =request.getParameter("ID");
               pass = request.getParameter("Pass");
               vaitro = request.getParameter("VaiTro");
               hoten = request.getParameter("HoTen");
               diachi = request.getParameter("DiaChi");
               sdt = request.getParameter("SoDT");
               email = request.getParameter("Email");
               try {
                   PreparedStatement pr=Controller.ConnectDB.getConnection().prepareStatement("insert into TAI_KHOAN values(?,?,?,?,?,?,?)");
                   pr.setString(1, tentk);
                   pr.setString(2, pass);
                   pr.setString(3, vaitro);
                   pr.setString(4, hoten);
                   pr.setString(5, diachi);
                   pr.setString(6, sdt);
                   pr.setString(7, email);
                   
                   pr.executeUpdate();
                   response.sendRedirect("QuantriAccount.jsp");
               } catch (Exception ex) {
                     response.sendRedirect("QuantriAccount.jsp");
               }  break;
           case "2":
              tentk =request.getParameter("ID");
               pass = request.getParameter("Pass");
               vaitro = request.getParameter("VaiTro");
               hoten = request.getParameter("HoTen");
               diachi = request.getParameter("DiaChi");
               sdt = request.getParameter("SoDT");
               email = request.getParameter("Email");
               try {
                   PreparedStatement pr=Controller.ConnectDB.getConnection().prepareStatement("update TAI_KHOAN set Pass = ?, VaiTro = ? , HoTen=?, DiaChi=?, SoDT=?, Email=? where ID=?");
                   pr.setString(7, tentk);
                   pr.setString(1, pass);
                   pr.setString(2, vaitro);
                   pr.setString(3, hoten);
                   pr.setString(4, diachi);
                   pr.setString(5, sdt);
                   pr.setString(6, email);
                   pr.executeUpdate();
                   Statement st =Controller.ConnectDB.getConnection().createStatement();
                   ResultSet rs = st.executeQuery("select * from TAI_KHOAN where ID='" + tentk + "'");
                   if (rs.next()) {
                       pass=rs.getString(2);
                       vaitro=rs.getString(3);
                       hoten=rs.getString(4);
                       diachi= rs.getString(5);
                       sdt = rs.getString(6);
                       email = rs.getString(7);
                      
                   } else {
                       
                       pass=rs.getString("");
                       vaitro=rs.getString("");
                       hoten=rs.getString("");
                       diachi= rs.getString("");
                       sdt = rs.getString("");
                       email = rs.getString("");
                   }
                   
                  response.sendRedirect("QuantriAccount.jsp");
               }catch(Exception e){
                   out.println(e);
                   response.sendRedirect("QuantriAccount.jsp");
               }
               break;
           case "3":
               {
                   String  tentk = request.getParameter("ID");
                   try {
                       
                       PreparedStatement pr =Controller.ConnectDB.getConnection().prepareStatement("delete from TAI_KHOAN where ID= ?");
                       pr.setString(1, tentk);
                       pr.executeUpdate();
                       
                       pass = ("");
                       vaitro =("");
                       hoten = ("");
                       diachi = ("");
                       sdt = ("");
                       email = ("");
                      response.sendRedirect("QuantriAccount.jsp");
                   } catch (Exception ex) {
                       response.sendRedirect("QuantriAccount.jsp");
                   }  break;
               }
           default:
               break;
       }
     }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

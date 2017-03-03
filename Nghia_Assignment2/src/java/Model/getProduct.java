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
@WebServlet(name = "getProduct", urlPatterns = {"/getProduct"})
public class getProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     static public String masp="";
    static public String tensp="";
    static public String mota="";
    static public String soluong="";
    static public float dongia;
    static public String hinhanh="";
    static public String nhasx="";
    static public String maloai="";
    static public String ac="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ac=request.getParameter("ac");
        PrintWriter out=response.getWriter();
       switch (ac) {
           case "0":
               masp =request.getParameter("MaSP");
               tensp = request.getParameter("TenSP");
               mota = request.getParameter("MoTa");
               soluong = request.getParameter("SoLuong");
               dongia = Float.parseFloat(request.getParameter("DonGia"));
               hinhanh = request.getParameter("HinhAnh");
               nhasx = request.getParameter("NhaSX");
               maloai = request.getParameter("MaLoai");
               try {
                   Statement st=Controller.ConnectDB.getConnection().createStatement();
                   ResultSet rs=st.executeQuery("select * from SAN_PHAM where MaSP='"+masp+"'");
                   if(rs.next()){
                       tensp=rs.getString(2);
                       mota=rs.getString(3);
                       soluong=rs.getString(4);
                       dongia= Float.parseFloat(rs.getString(5));
                       hinhanh = rs.getString(6);
                       nhasx = rs.getString(7);
                       maloai = rs.getString(8);
                       
                   }else{
                       tensp=rs.getString("");
                       mota = rs.getString("");
                       soluong = rs.getString("");
                       dongia = rs.getFloat("");
                       hinhanh = rs.getString("");
                       nhasx = rs.getString("");
                       maloai = rs.getString("");
                       
                   }response.sendRedirect("QuanLySP.jsp");
               } catch (SQLException ex) { 
                     out.println("Không tìm thấy sản phẩm");
               }  break;
           case "1":
              masp =request.getParameter("MaSP");
               tensp = request.getParameter("TenSP");
               mota = request.getParameter("MoTa");
               soluong = request.getParameter("SoLuong");
               dongia = Float.parseFloat(request.getParameter("DonGia"));
               hinhanh = request.getParameter("HinhAnh");
               nhasx = request.getParameter("NhaSX");
               maloai = request.getParameter("MaLoai");
               try {
                   PreparedStatement pr=Controller.ConnectDB.getConnection().prepareStatement("insert into SAN_PHAM values(?,?,?,?,?,?,?,?)");
                   pr.setString(1, masp);
                   pr.setString(2, tensp);
                   pr.setString(3, mota);
                   pr.setString(4, soluong);
                   pr.setInt(5, (int) dongia);
                   pr.setString(6, hinhanh);
                   pr.setString(7, nhasx);
                   pr.setString(8, maloai);
                   pr.executeUpdate();
                   response.sendRedirect("QuanLySP.jsp");
               } catch (Exception ex) {
                     response.sendRedirect("QuanLySP.jsp");
               }  break;
           case "2":
              masp =request.getParameter("MaSP");
               tensp = request.getParameter("TenSP");
               mota = request.getParameter("MoTa");
               soluong = request.getParameter("SoLuong");
               dongia = Float.parseFloat(request.getParameter("DonGia"));
               hinhanh = request.getParameter("HinhAnh");
               nhasx = request.getParameter("NhaSX");
               maloai = request.getParameter("MaLoai");
               try {
                   PreparedStatement pr=Controller.ConnectDB.getConnection().prepareStatement("update SAN_PHAM set  TenSP= ?  , MoTa = ?, SoLuong = ? , DonGia=?, HinhAnh=?, NhaSX=?, MaLoai=? where MaSP=?");
                   pr.setString(8, masp);
                   pr.setString(1, tensp);
                   pr.setString(2, mota);
                   pr.setString(3, soluong);
                   pr.setInt(4, (int) dongia);
                   pr.setString(5, hinhanh);
                   pr.setString(6, nhasx);
                   pr.setString(7, maloai);
                   pr.executeUpdate();
                   Statement st =Controller.ConnectDB.getConnection().createStatement();
                   ResultSet rs = st.executeQuery("select * from SAN_PHAM where MaSP='" + masp + "'");
                   if (rs.next()) {
                       tensp=rs.getString(2);
                       mota=rs.getNString(3);
                       soluong=rs.getString(4);
                       dongia= Float.parseFloat(rs.getString(5));
                       hinhanh = rs.getString(6);
                       nhasx = rs.getString(7);
                       maloai = rs.getString(8);
                   } else {
                       tensp=rs.getString("");
                       mota = rs.getString("");
                       soluong = rs.getString("");
                       dongia = rs.getFloat("");
                       hinhanh = rs.getString("");
                       nhasx = rs.getString("");
                       maloai = rs.getString("");
                   }
                   
                   response.sendRedirect("QuanLySP.jsp");
               }catch(Exception e){
                   out.println(e);
                   response.sendRedirect("QuanLySP.jsp");
               }
               break;
           case "3":
               {
                   String  masp = request.getParameter("MaSP");
                   try {
                       
                       PreparedStatement pr =Controller.ConnectDB.getConnection().prepareStatement("delete from SAN_PHAM where MaSP= ?");
                       pr.setString(1, masp);
                       pr.executeUpdate();
                       tensp=("");
                       mota = ("");
                       soluong =("");
                       dongia = Float.parseFloat("");
                       hinhanh = ("");
                       nhasx = ("");
                       maloai = ("");
                       response.sendRedirect("QuanLySP.jsp");
                   } catch (Exception ex) {
                       response.sendRedirect("QuanLySP.jsp");
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

<%-- 
    Document   : Quantri
    Created on : Oct 4, 2016, 4:37:00 PM
    Author     : khang
--%>

<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <jsp:include page="header.jsp"></jsp:include>
     <center> <h1>HÃY CHỌN NỘI DUNG CẦN QUẢN LÝ</h1>
             
             <a href="QuantriAccount.jsp"><input type="submit" value="Quản lý Account"></a>
             <a href="QuanLySP.jsp"><input type="submit" value="Quản lý Sản phẩm"></a>
             
         </center>
         
       <jsp:include page="footer.jsp"></jsp:include>
</html>



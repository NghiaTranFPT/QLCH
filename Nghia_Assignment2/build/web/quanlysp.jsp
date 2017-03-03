<%-- 
    Document   : QuanLySP
    Created on : Oct 21, 2016, 12:40:50 PM
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
        <center>  
                 <table border="2">
            <tr>
                <td>Mã SP</td>
                <td>Tên sp</td>
                <td>Mô tả</td>
                <td>Số lượng</td>
                <td>Đơn giá</td>
                <td>Hình ảnh</td>
                <td>Nhà sx</td>
                <td>Mã loại</td>
                
            </tr>
             <% Connection con=null;
  PreparedStatement preStmt=null;
  ResultSet rs=null;

      String username="nghia";
      String password="12345";
        String url="jdbc:sqlserver://localhost:1433;databaseName=QLCH";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(url,username,password);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        String sql="select * from SAN_PHAM ";
        preStmt=con.prepareStatement(sql);
        rs=preStmt.executeQuery();
        if(rs!=null){
            ResultSetMetaData meta=rs.getMetaData();

            while(rs.next()){
                out.println("<tr>");
              for(int i=1; i<=meta.getColumnCount(); i++){ %>
                  <td> <%=rs.getString(i)%> </td>
        <%
              }out.println("</tr>");
            }
        }rs.close();
        preStmt.close();
        con.close();
            %>
                     
        
    <div class="dangky">
             <%
            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            %>
        <script>
                        function ac0() {
                            var a0 = 0;
                            document.getElementById("ac").value = a0;

                        }
                        function ac1() {
                            var a1 = 1;
                            document.getElementById("ac").value = a1;
                        }
                        function ac2() {
                            var a2 = 2;
                            document.getElementById("ac").value = a2;
                        }
                        function ac3() {
                            var a3 = 3;
                            document.getElementById("ac").value = a3;
                        }
                      
                    </script>
                    <p>&nbsp;</p>
       
                        
                        <center></br></br></br>
                            <center><a href="QuantriAccount.jsp"><input type="submit" value="Chuyển đến trang quản lý Account"></a></center>
                            <h1> QUẢN LÝ SẢN PHẨM</h1>
       <form action="getProduct" method="post">
           <center>
		<table width="70%" border="2" >
			
			<tr><td><b>Mã Sản Phẩm</b></td>
                             
                               
                            <td> <input type="text" class="" name="MaSP" value="<%=Model.getProduct.masp%>"><input type="submit" value="Tìm" onclick="ac0()"></td>
				
                             
			</tr>
                        <tr><td><b>Tên Sản Phẩm</b></td><td>
                                <input type="text" class="panjang" name="TenSP" value="<%=Model.getProduct.tensp%>"</td></tr>
			
			 <tr><td><b>Mô Tả</b></td><td>
                                <input type="text" class="panjang" name="MoTa" value="<%=Model.getProduct.mota%>"</td></tr>	
			</td></tr>
			 <tr><td><b>Số Lượng</b></td><td>
                                <input type="text" class="panjang" name="SoLuong" value="<%=Model.getProduct.soluong%>"</td></tr>	
			</td></tr>
                         <tr><td><b>Đơn Giá</b></td><td>
                                <input type="text" class="panjang" name="DonGia" value="<%=Model.getProduct.dongia%>"</td></tr>	
			</td></tr>
                        <tr><td><b>Hình Ảnh</b></td><td>
                                <input type="text" class="panjang" name="HinhAnh" value="<%=Model.getProduct.hinhanh%>"</td></tr>	
			</td></tr>
                         <tr><td><b>Nhà Sản Xuất</b></td><td>
                                <input type="text" class="panjang" name="NhaSX" value="<%=Model.getProduct.nhasx%>"</td></tr>	
                          <tr><td><b>Mã Loại</b></td><td>
                                <input type="text" class="panjang" name="MaLoai" value="<%=Model.getProduct.maloai%>"</td></tr>	
			</td></tr>
			</td></tr>
			<tr><td>
                               
                             <td height="40"><input type="submit" value="Thêm" onclick="ac1()" >  <input type="submit" value=" Sửa " onclick="ac2()">  <input type="submit" value=" Xóa " onclick="ac3()"></td>
			</td></tr>
                         <input type="text" value="" style="display: none" id="ac" name="ac"> 
                </table>
                        </center> 
       </form></center>
    <jsp:include page="footer.jsp"></jsp:include>
	
    </body>
</html>


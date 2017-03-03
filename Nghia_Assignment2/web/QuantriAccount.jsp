<%-- 
    Document   : QuantriAccount
    Created on : Oct 21, 2016, 1:42:14 PM
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
         <center><a href="quanlysp.jsp"><input type="submit" value="Chuyển đến trang quản lý Sản phẩm"></a></center>
         <center><h2>QUẢN LÝ TÀI KHOẢN</h2></center>
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
       
                        
                        <center></br></br></br>
                            
       <form action="getAccount" method="post">
           <center>
		<table width="50%" border="1" >
			
			<tr><td><b>Tên tài khoản: </b></td>
                             
                               
                            <td><input type="text" class="" name="ID" value="<%=Model.getAccount.tentk%>"><input type="submit" value="Tìm" onclick="ac0()"></td>
				
                             
			</tr>
                        <tr><td><b>Mật khẩu: </b></td><td>
                                <input type="text" class="panjang" name="Pass" value="<%=Model.getAccount.pass%>"></td></tr>
			
			 <tr><td><b>Vai trò: </b></td><td>
                                <input type="text" class="panjang" name="VaiTro" value="<%=Model.getAccount.vaitro%>"></td></tr>	
			
			 <tr><td><b>Họ và tên:</b></td><td>
                                <input type="text" class="panjang" name="HoTen" value="<%=Model.getAccount.hoten%>"></td></tr>	
			
                         <tr><td><b>Địa chỉ: </b></td><td>
                                <input type="text" class="panjang" name="DiaChi" value="<%=Model.getAccount.diachi%>"></td></tr>	
			
                        <tr><td><b>Số điện thoại:</b></td><td>
                                <input type="text" class="panjang" name="SoDT" value="<%=Model.getAccount.sdt%>"></td></tr>	
			
                         <tr><td><b>Email: </b></td><td>
                                <input type="text" class="panjang" name="Email" value="<%=Model.getAccount.email%>"></td></tr>	
                          
			<tr><td>
                               
                             <td height="40"><input type="submit" value="Thêm" onclick="ac1()" >  <input type="submit" value=" Sửa " onclick="ac2()">  <input type="submit" value=" Xóa " onclick="ac3()"></td>
			</tr>
                         <input type="text" value="" style="display: none" id="ac" name="ac"> 
                </table>
                        
       </form>
                            <h2>  DỮ LIỆU DANH SÁCH TÀI KHOẢN</h2>
                            <table border="2">
            <tr>
                <td>ID</td>
                <td>PASS</td>
                <td>VAI TRO</td>
                <td>HO TEN</td>
                <td>DIA CHI</td>
                <td>SDT</td>
                <td>EMAIL</td>
                
            </tr>
            </center> 
           
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
        String sql="select * from TAI_KHOAN ";
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
	<p>&nbsp;</p>
        <p>&nbsp;</p>
    </body>
   
</html>




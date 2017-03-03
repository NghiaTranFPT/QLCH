
     <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <style type="text/css">
         body,td,th {
	font-family: Cambria;
}
         .a {
	font-family: Cambria;
}
         </style>
         <jsp:include page="header.jsp"></jsp:include>
<header id="header">
		<div class="topbar">
			<div class="container">
				<div class="col-xs-12 col-sm-6 p0 hotline-top">

                                       
				</div>
			</div>
		</div>
		<div class="header">
			<div class="container">
				<div class="col-xs-12 col-md-4">
					<div id="logo"></div>
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4">
					
				</div>
				<div class="col-xs-12 col-sm-6 col-md-4">
					
				</div>
			</div>	
		</div>
		
			  <div class="dangky">
    <center>
        <h1>Register account</h1><form action="AccountServlet" method="get">
            <table width="500" height="300" border="0px" > 
                <span style="text-align: left ">
                    
                    <tr>
                        <th align="right" class="a"  scope="row" >Tên đăng nhập: </th>
                      <td><input type="text" name="tentk" value="" size="30" /></td>
                    </tr>
                 
                    <tr>
                        <th align="center" class="a"  scope="row">Mật khẩu:</th>
                      <td><input type="password" name="pass" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <th align="center" class="a" scope="row">Vai tro:</th>
                        <td>
                           <input type="text" name="vaitro" value="" size="30" />
                        </td>
                    </tr>
                    
                    <tr>
                        <th align="center" class="a" scope="row" >Họ tên:</th>
                      <td><input type="text" name="hoten" value="" size="30" /></td>
                    </tr>
                  
                    <tr>
                        <th align="center" class="a" scope="row">Địa chỉ:</th>
                        <td>
                           <input type="text" name="diachi" value="" size="30" />
                        </td>
                    </tr>
                    
                    <tr>
                        <th align="center" class="a" scope="row">Email:</th>
                      <td><input type="text" name="email" value="" size="30" /> </td>
                    </tr>

                    <tr>                   
                        <th align="center" class="a" scope="row">SĐT: </th>
                      <td>  <input type="text" name="sdt" value="" size="30" />  </td>
                    </tr>
                    <th scope="row">&nbsp;</th>
                    <td>
                        
                            <input type="submit" name="dk"  value="Đăng kí"   />
                            <input type="reset" value="Hủy">
                            
                    </td>
                    </tr>
                </span>
            </table></from>
        </div>
					       
	<jsp:include page="footer.jsp"></jsp:include>
	
    </body>
</html>
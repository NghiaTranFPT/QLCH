

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
		
			<div>
            <center>
                <form action="LoginServlet" method="get">
                <h1>LOGIN</h1>
                 <p>&nbsp;</p>
                 <p>&nbsp;</p>
                <%--<%= session.getAttribute("login") %>--%>
                <p>UserName : 
                  <input type="text" name="t1" value="" size="20" />
                    <p>&nbsp;</p>
                   Password :
                   <input type="password" name="t2" value="" size="20" />
                </p>
                <p> <input type="submit" value="Login"  /> 
                  <input type="reset" value="Hủy">
                </p>
                </form>
            </center>
        </div>
					       
	<jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>



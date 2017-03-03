package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class QuantriAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <center><a href=\"quanlysp.jsp\"><input type=\"submit\" value=\"Chuyển đến trang quản lý Sản phẩm\"></a></center>\n");
      out.write("         <center><h2>QUẢN LÝ TÀI KHOẢN</h2></center>\n");
      out.write("\t\t\t  <script>\n");
      out.write("                        function ac0() {\n");
      out.write("                            var a0 = 0;\n");
      out.write("                            document.getElementById(\"ac\").value = a0;\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        function ac1() {\n");
      out.write("                            var a1 = 1;\n");
      out.write("                            document.getElementById(\"ac\").value = a1;\n");
      out.write("                        }\n");
      out.write("                        function ac2() {\n");
      out.write("                            var a2 = 2;\n");
      out.write("                            document.getElementById(\"ac\").value = a2;\n");
      out.write("                        }\n");
      out.write("                        function ac3() {\n");
      out.write("                            var a3 = 3;\n");
      out.write("                            document.getElementById(\"ac\").value = a3;\n");
      out.write("                        }\n");
      out.write("                      \n");
      out.write("                    </script>\n");
      out.write("       \n");
      out.write("                        \n");
      out.write("                        <center></br></br></br>\n");
      out.write("                            \n");
      out.write("       <form action=\"getAccount\" method=\"post\">\n");
      out.write("           <center>\n");
      out.write("\t\t<table width=\"50%\" border=\"1\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr><td><b>Tên tài khoản: </b></td>\n");
      out.write("                             \n");
      out.write("                               \n");
      out.write("                            <td><input type=\"text\" class=\"\" name=\"ID\" value=\"");
      out.print(Model.getAccount.tentk);
      out.write("\"><input type=\"submit\" value=\"Tìm\" onclick=\"ac0()\"></td>\n");
      out.write("\t\t\t\t\n");
      out.write("                             \n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr><td><b>Mật khẩu: </b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Pass\" value=\"");
      out.print(Model.getAccount.pass);
      out.write("\"></td></tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <tr><td><b>Vai trò: </b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"VaiTro\" value=\"");
      out.print(Model.getAccount.vaitro);
      out.write("\"></td></tr>\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <tr><td><b>Họ và tên:</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"HoTen\" value=\"");
      out.print(Model.getAccount.hoten);
      out.write("\"></td></tr>\t\n");
      out.write("\t\t\t\n");
      out.write("                         <tr><td><b>Địa chỉ: </b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"DiaChi\" value=\"");
      out.print(Model.getAccount.diachi);
      out.write("\"></td></tr>\t\n");
      out.write("\t\t\t\n");
      out.write("                        <tr><td><b>Số điện thoại:</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"SoDT\" value=\"");
      out.print(Model.getAccount.sdt);
      out.write("\"></td></tr>\t\n");
      out.write("\t\t\t\n");
      out.write("                         <tr><td><b>Email: </b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"Email\" value=\"");
      out.print(Model.getAccount.email);
      out.write("\"></td></tr>\t\n");
      out.write("                          \n");
      out.write("\t\t\t<tr><td>\n");
      out.write("                               \n");
      out.write("                             <td height=\"40\"><input type=\"submit\" value=\"Thêm\" onclick=\"ac1()\" >  <input type=\"submit\" value=\" Sửa \" onclick=\"ac2()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"ac3()\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("                         <input type=\"text\" value=\"\" style=\"display: none\" id=\"ac\" name=\"ac\"> \n");
      out.write("                </table>\n");
      out.write("                        \n");
      out.write("       </form>\n");
      out.write("                            <h2>  DỮ LIỆU DANH SÁCH TÀI KHOẢN</h2>\n");
      out.write("                            <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <td>ID</td>\n");
      out.write("                <td>PASS</td>\n");
      out.write("                <td>VAI TRO</td>\n");
      out.write("                <td>HO TEN</td>\n");
      out.write("                <td>DIA CHI</td>\n");
      out.write("                <td>SDT</td>\n");
      out.write("                <td>EMAIL</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            </center> \n");
      out.write("           \n");
      out.write("            ");
 Connection con=null;
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
              for(int i=1; i<=meta.getColumnCount(); i++){ 
      out.write("\n");
      out.write("                  <td> ");
      out.print(rs.getString(i));
      out.write(" </td>\n");
      out.write("        ");

              }out.println("</tr>");
            }
        }rs.close();
        preStmt.close();
        con.close();
            
      out.write("\n");
      out.write("\t<p>&nbsp;</p>\n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

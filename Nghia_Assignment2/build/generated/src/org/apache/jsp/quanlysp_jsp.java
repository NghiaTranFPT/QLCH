package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class quanlysp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <center>  \n");
      out.write("                 <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Mã SP</td>\n");
      out.write("                <td>Tên sp</td>\n");
      out.write("                <td>Mô tả</td>\n");
      out.write("                <td>Số lượng</td>\n");
      out.write("                <td>Đơn giá</td>\n");
      out.write("                <td>Hình ảnh</td>\n");
      out.write("                <td>Nhà sx</td>\n");
      out.write("                <td>Mã loại</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("             ");
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
        String sql="select * from SAN_PHAM ";
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
      out.write("                     \n");
      out.write("        \n");
      out.write("    <div class=\"dangky\">\n");
      out.write("             ");

            String error = "";
            if (request.getParameter("error")!=null) {
                    error = (String) request.getParameter("error");
                }
            
            
            
      out.write("\n");
      out.write("        <script>\n");
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
      out.write("                    <p>&nbsp;</p>\n");
      out.write("       \n");
      out.write("                        \n");
      out.write("                        <center></br></br></br>\n");
      out.write("                            <center><a href=\"QuantriAccount.jsp\"><input type=\"submit\" value=\"Chuyển đến trang quản lý Account\"></a></center>\n");
      out.write("                            <h1> QUẢN LÝ SẢN PHẨM</h1>\n");
      out.write("       <form action=\"getProduct\" method=\"post\">\n");
      out.write("           <center>\n");
      out.write("\t\t<table width=\"70%\" border=\"2\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<tr><td><b>Mã Sản Phẩm</b></td>\n");
      out.write("                             \n");
      out.write("                               \n");
      out.write("                            <td> <input type=\"text\" class=\"\" name=\"MaSP\" value=\"");
      out.print(Model.getProduct.masp);
      out.write("\"><input type=\"submit\" value=\"Tìm\" onclick=\"ac0()\"></td>\n");
      out.write("\t\t\t\t\n");
      out.write("                             \n");
      out.write("\t\t\t</tr>\n");
      out.write("                        <tr><td><b>Tên Sản Phẩm</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"TenSP\" value=\"");
      out.print(Model.getProduct.tensp);
      out.write("\"</td></tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <tr><td><b>Mô Tả</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"MoTa\" value=\"");
      out.print(Model.getProduct.mota);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t <tr><td><b>Số Lượng</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"SoLuong\" value=\"");
      out.print(Model.getProduct.soluong);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <tr><td><b>Đơn Giá</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"DonGia\" value=\"");
      out.print(Model.getProduct.dongia);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                        <tr><td><b>Hình Ảnh</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"HinhAnh\" value=\"");
      out.print(Model.getProduct.hinhanh);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <tr><td><b>Nhà Sản Xuất</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"NhaSX\" value=\"");
      out.print(Model.getProduct.nhasx);
      out.write("\"</td></tr>\t\n");
      out.write("                          <tr><td><b>Mã Loại</b></td><td>\n");
      out.write("                                <input type=\"text\" class=\"panjang\" name=\"MaLoai\" value=\"");
      out.print(Model.getProduct.maloai);
      out.write("\"</td></tr>\t\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("\t\t\t<tr><td>\n");
      out.write("                               \n");
      out.write("                             <td height=\"40\"><input type=\"submit\" value=\"Thêm\" onclick=\"ac1()\" >  <input type=\"submit\" value=\" Sửa \" onclick=\"ac2()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"ac3()\"></td>\n");
      out.write("\t\t\t</td></tr>\n");
      out.write("                         <input type=\"text\" value=\"\" style=\"display: none\" id=\"ac\" name=\"ac\"> \n");
      out.write("                </table>\n");
      out.write("                        </center> \n");
      out.write("       </form></center>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

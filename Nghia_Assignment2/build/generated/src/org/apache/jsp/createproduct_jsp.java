package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\t\t\n");
      out.write("     <center> <h3>Thêm Mới Sản Phẩm</h3>\n");
      out.write("<form action=\"doCreateProductServlet\" method=\"post\" >\n");
      out.write("<table width=\"543\" height=\"455\" border=\"1\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td>Mã sản phẩm: </td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Tên sản phẩm:</td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Mô tả: </td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Số lượng: </td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Đơn giá: </td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"106\">Hình ảnh </td>\n");
      out.write("    <td><textarea cols=\"50\" ></textarea></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Nhà sản xuất </td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Mã loại </td>\n");
      out.write("    <td><input type=\"text\" name=\"t1\" value=\"\" size=\"50\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" align=\"center\">\n");
      out.write("    \t\t\t\t<input type=\"submit\" name=\"add\" value=\"Add\"  />&nbsp;&nbsp;&nbsp;\n");
      out.write("    \t\t\t\t<input type=\"submit\" name=\"update\" value=\"Update\"  />&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <input type=\"submit\" name=\"delete\" value=\"Delete\"  />\n");
      out.write("                    &nbsp;&nbsp;&nbsp;\n");
      out.write("    </td>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("  </tr>\n");
      out.write("</table></form></center>\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

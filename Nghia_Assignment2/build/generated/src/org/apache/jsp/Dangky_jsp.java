package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("     \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("         <style type=\"text/css\">\r\n");
      out.write("         body,td,th {\r\n");
      out.write("\tfont-family: Cambria;\r\n");
      out.write("}\r\n");
      out.write("         .a {\r\n");
      out.write("\tfont-family: Cambria;\r\n");
      out.write("}\r\n");
      out.write("         </style>\r\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("\t\t<div class=\"topbar\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-6 p0 hotline-top\">\r\n");
      out.write("\r\n");
      out.write("                                       \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t  <div class=\"dangky\">\r\n");
      out.write("    <center>\r\n");
      out.write("        <h1>Register account</h1><form action=\"AccountServlet\" method=\"get\">\r\n");
      out.write("            <table width=\"500\" height=\"300\" border=\"0px\" > \r\n");
      out.write("                <span style=\"text-align: left \">\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th align=\"right\" class=\"a\"  scope=\"row\" >Tên đăng nhập: </th>\r\n");
      out.write("                      <td><input type=\"text\" name=\"tentk\" value=\"\" size=\"30\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                 \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th align=\"center\" class=\"a\"  scope=\"row\">Mật khẩu:</th>\r\n");
      out.write("                      <td><input type=\"password\" name=\"pass\" value=\"\" size=\"30\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th align=\"center\" class=\"a\" scope=\"row\">Vai tro:</th>\r\n");
      out.write("                        <td>\r\n");
      out.write("                           <input type=\"text\" name=\"vaitro\" value=\"\" size=\"30\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th align=\"center\" class=\"a\" scope=\"row\" >Họ tên:</th>\r\n");
      out.write("                      <td><input type=\"text\" name=\"hoten\" value=\"\" size=\"30\" /></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th align=\"center\" class=\"a\" scope=\"row\">Địa chỉ:</th>\r\n");
      out.write("                        <td>\r\n");
      out.write("                           <input type=\"text\" name=\"diachi\" value=\"\" size=\"30\" />\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th align=\"center\" class=\"a\" scope=\"row\">Email:</th>\r\n");
      out.write("                      <td><input type=\"text\" name=\"email\" value=\"\" size=\"30\" /> </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    <tr>                   \r\n");
      out.write("                        <th align=\"center\" class=\"a\" scope=\"row\">SĐT: </th>\r\n");
      out.write("                      <td>  <input type=\"text\" name=\"sdt\" value=\"\" size=\"30\" />  </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <th scope=\"row\">&nbsp;</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        \r\n");
      out.write("                            <input type=\"submit\" name=\"dk\"  value=\"Đăng kí\"   />\r\n");
      out.write("                            <input type=\"reset\" value=\"Hủy\">\r\n");
      out.write("                            \r\n");
      out.write("                    </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </span>\r\n");
      out.write("            </table></from>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\t\t\t       \r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

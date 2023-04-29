package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>call</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body background=\"images/iStock_000022293258_Small.jpg\">\n");
      out.write("<form method=\"post\" action=\"empcode.jsp\">\n");
      out.write("\n");
      out.write("<table cellpadding=\"4\" cellspacing=\"2\"  width=\"50%\" border=\"10px\" align=\"center\"   style=\"font-color:seagreen; background-color:lightgreen\"; font-size:25px; blue;border-style:ridge;border-color:#eeacfb;\">\n");
      out.write("       <tr>\n");
      out.write("        <td align=\"center\"><h1>User Register</h1></td>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("    <hr size=\"15\" color=\"black\"/>\n");
      out.write("<br>\n");
      out.write("<table cellpadding=\"4\" cellspacing=\"2\"  width=\"50%\" border=\"10px\" align=\"center\"   style=\"font-color:seagreen; background-color:lightyellow\"; font-size:25px; blue;border-style:ridge;border-color:#eeacfb;\">\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">employeeid</td>\n");
      out.write("<td><input type=\"text\" name=\"id\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">companyname</td>\n");
      out.write("<td><input type=\"text\" name=\"companyname\"/></td>\n");
      out.write("</tr>\n");
      out.write("    <tr>\n");
      out.write("<td align=\"center\">Fname </td>\n");
      out.write("<td><input type=\"text\" name=\"fname\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">Lname</td>\n");
      out.write("<td><input type=\"text\" name=\"lname\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">address</td>\n");
      out.write("<td><input type=\"text\" name=\"address\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">cnum</td>\n");
      out.write("<td><input type=\"password\" name=\"cnum\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">experience</td>\n");
      out.write("<td><input type=\"text\" name=\"experience\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\">designation</td>\n");
      out.write("<td><input type=\"text\" name=\"address\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\">\n");
      out.write("<input type=\"submit\" value=\"Submit\" />\n");
      out.write("<input type=\"reset\" value=\"Reset\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

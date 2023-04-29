package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class d2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body BGCOLOR=\"LIGHTGREEN\">\n");
      out.write("        <table  border=\"2\"  cellpadding=\"2\" cellspacing=\"0\" bgcolor=\"skyblue\" width=\"40%\">\n");
      out.write("      <tr><td><center><font size=\"+5\" color=\"GREEN\"> Delete Employee Details</center></td>\n");
      out.write("      </tr>\n");
      out.write("     \n");
      out.write("<hr size=\"10\" color=\"lightgreen\"></hr>\n");
      out.write("\n");
      out.write(" <form action=\"d2.jsp\">\n");
      out.write("<table BORDER=\"2\" WIDTH=\"30$\">\n");
      out.write("<tr>\n");
      out.write("<td>Employeeid</td>\n");
      out.write("<td><input type=\"text\" name=\"id\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" value=\"Delete\"/></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    <hr color=\"purple\" size=\"10\" />\n");
      out.write("</form>\n");
      out.write(" \n");
      out.write("    ");

String id=request.getParameter("id");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/callcenter","root", "root");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM employee WHERE Employeeid="+id);
if(i>0){
      out.write("\n");
      out.write("\t           <br>\n");
      out.write("\t           <TABLE style=\"background-color: #E3E4FA;\" \n");
      out.write("                   WIDTH=\"30%\" border=\"1\">\n");
      out.write("                       <tr><th>Data Deleted successfully <a href='adminhome.jsp'> Home</a></th></tr>\n");
      out.write("\t\t   </table>\n");
      out.write("              ");

    }
else
{
    out.println("Error occured");
}
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}

      out.write("\n");
      out.write("</body>\n");
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

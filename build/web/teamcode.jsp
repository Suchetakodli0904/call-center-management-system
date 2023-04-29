<%@ page import ="java.sql.*" %>
<%
    
    
     String teamid  = request.getParameter("id");   
     String dept = request.getParameter("companyname");
   String teamLeadername = request.getParameter("fname");
    String totalEmpInTeam  = request.getParameter("lname");    
    String description= request.getParameter("address");
    String PDate = request.getParameter("cnum");
     
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callcenter",
            "root","root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into  team(teamid,dept,teamLeadername,totalEmpInTeam,description,PDate) values ('" +teamid+ "','" +dept+ "','" + teamLeadername+ "','" + totalEmpInTeam + "','" + description+ "','" +PDate+ "')");
    if (i > 0)
    {
        //session.setAttribute("userid", user);
       
        out.print(" Successfull");
        out.print("<html>");
				  out.print("<body bgcolor='lightgreen'>");
				                           			  
				out.print("<a href='adminhome.jsp'>Back</a>");
				                                    			  
				 out.print("</body>");
				   out.print("</html>");
    }else {
        out.print(" UnSuccessfull");
    }
%>



<%@ page import ="java.sql.*" %>
<%
    
    
     String employeeid  = request.getParameter("id");   
     String companyname = request.getParameter("companyname");
   String fname = request.getParameter("fname");
    String lname  = request.getParameter("lname");    
    String address= request.getParameter("address");
    String cnum = request.getParameter("cnum");
     String experience = request.getParameter("experience");
         String designation = request.getParameter("designation");
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callcenter",
            "root","root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into  employee(employeeid,companyname,fname,lname,address,cnum,experience,designation) values ('" +employeeid+ "','" +companyname+ "','" + fname+ "','" + lname  + "','" + address+ "','" +cnum+ "','" + experience+ "','" +designation+ "')");
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



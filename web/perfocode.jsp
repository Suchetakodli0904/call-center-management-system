<%@ page import ="java.sql.*" %>
<%
    
    
     String performenceid  = request.getParameter("id");   
     String empid= request.getParameter("companyname");
   String name = request.getParameter("fname");
    String designation  = request.getParameter("lname");    
    String dept= request.getParameter("address");
    String date = request.getParameter("cnum");
      String CustomerRating  = request.getParameter("CustomerRating");
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callcenter",
            "root","root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into  performenc(performenceid,empid,name,designation,dept,date,CustomerRating) values ('" +performenceid+ "','" +empid+ "','" +name+ "','" + designation + "','" + dept+ "','" +date+ "','" +CustomerRating+ "')");
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



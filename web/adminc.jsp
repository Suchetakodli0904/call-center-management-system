<%@ page import ="java.sql.*" %>
<%
    String username  = request.getParameter("username");    
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/callcenter",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from admin where username='" + username+ "' and password='" + password+ "'");
    if (rs.next()) {
        session.setAttribute("username",username);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("adminhome.jsp");
    } else {
        out.println("Invalid password <a href='adminlog.jsp'>try again</a>");
    }
%>
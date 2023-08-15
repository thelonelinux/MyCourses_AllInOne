<%@page import="java.util.Date, java.sql.*" info="JSP page directive Example" language="java"  %>

<h2 style=text-align:center;color:blue>
<%
  Date today = new Date();
  out.println(today);
  out.println("<br><br>");
  out.println(getServletInfo());
%>
</h2>
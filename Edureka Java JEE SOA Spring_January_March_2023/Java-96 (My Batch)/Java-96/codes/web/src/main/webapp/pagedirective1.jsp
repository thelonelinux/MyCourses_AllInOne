<%@page import="java.util.Date" info="JSP page Directive example" language="java"  %>
<p style=font-size:32px;color:blue;text-align:center>
<%
  Date today = new Date();
  out.println(today);  
%>
<br><br>
<%=getServletInfo() %>
</p>
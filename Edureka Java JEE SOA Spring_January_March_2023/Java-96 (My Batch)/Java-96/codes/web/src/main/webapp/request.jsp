<%!
 String userName;
 String password;
%>
<h2>

<%
 userName = request.getParameter("txt_uid");
 password = request.getParameter("txt_pwd");
 
 out.println("user name = " + userName + "<br>");
 out.println("password = " + password + "<br>");
%>
</h2>
<hr>
<h2>
server name = <%=request.getServerName() %> <br>
server port = <%=request.getServerPort() %> <br>
method = <%=request.getMethod() %> <br>
protocol = <%=request.getProtocol() %> <br>
application = <%=request.getContextPath() %>
</h2>
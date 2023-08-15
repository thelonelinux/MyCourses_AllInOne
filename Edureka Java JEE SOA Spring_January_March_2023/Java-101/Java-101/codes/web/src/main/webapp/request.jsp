<%!
 String user, pass;
%>
<h2>
<%
 user = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 out.println("user name = " + user + "<br>");
 out.println("password = " + pass);
%>
</h2>
<hr>

<h2>
server name = <%=request.getServerName() %> <br>
server port = <%=request.getServerPort() %> <br>
protocol = <%=request.getProtocol() %> <br>
method = <%=request.getMethod() %> <br>
application name = <%=request.getContextPath() %> <br>
url = <%=request.getRequestURL() %>
</h2>
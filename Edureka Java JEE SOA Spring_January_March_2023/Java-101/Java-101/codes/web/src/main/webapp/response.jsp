<%!
 String user, pass;
%>
<h2>
<%
 user = request.getParameter("txt_uid");
 pass = request.getParameter("txt_pwd");
 
 if(user.equals("admin") && pass.equals("1234"))
	 response.sendRedirect("https://www.edureka.co");
 else
	 response.sendError(response.SC_UNAUTHORIZED, "Authentication Failed! Invalid username/ password");
%> 
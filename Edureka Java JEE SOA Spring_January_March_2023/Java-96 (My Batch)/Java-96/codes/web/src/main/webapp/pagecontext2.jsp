<h2>
<%
 //String userName = request.getParameter("txt_uid");

 String userName = pageContext.getAttribute("uname", PageContext.SESSION_SCOPE).toString();
 
 out.println("Hello, "+ userName);
%>
</h2>
<h2>
<%
 String user = request.getParameter("txt_uid");
 pageContext.setAttribute("uname", user, PageContext.SESSION_SCOPE);
 
 out.println("Hello " + user);
%>
</h2>
<hr>
<a href="pagecontext2.jsp">Next Page</a>
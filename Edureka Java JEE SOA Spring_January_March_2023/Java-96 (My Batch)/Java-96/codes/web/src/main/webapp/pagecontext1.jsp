<h2>
<%
 String userName = request.getParameter("txt_uid");

 pageContext.setAttribute("uname", userName, PageContext.SESSION_SCOPE);
 
 out.println("Hello, "+ userName);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>
<%@page isErrorPage="true" %>
<body style="background-color:gray;color:yellow">
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println(exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
 	 out.println("invalid array index --> " + exception.getMessage());
 else
	 out.println("Internal Server Error");
%>
</h2>
</body>
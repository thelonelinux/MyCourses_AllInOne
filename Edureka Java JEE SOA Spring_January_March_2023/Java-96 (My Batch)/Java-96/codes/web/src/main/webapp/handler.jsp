<%@page isErrorPage="true"%>
<body style=background-color:gray;color:yellow;font-size:20px;>
<%
 if(exception instanceof ArithmeticException)
	 out.println("ERROR: " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("ERROR: " + exception.getMessage());
 else
	 out.println("Internal Server Error .. Try Again after some time!!!");
%>
</body>
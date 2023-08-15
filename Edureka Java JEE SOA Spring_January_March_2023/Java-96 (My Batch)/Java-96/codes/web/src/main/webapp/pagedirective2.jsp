<%@page errorPage="handler.jsp" %>
<%!
  int x = 10;
  //int y = 5;
  int y = 0;
  int[] marks =new int[7];
%>

<h2>
<%
 int res = x / y;
 out.println(x + " / " + y + " = " + res);
%>
<br><br>

<%=marks[0] %>
</h2>
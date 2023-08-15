<%!
 String companyName = "edureka limited";
 
 public int add(int x, int y){
	 return x + y;
 }
%>

<h2>
<%
 out.println("my company name = " + companyName + "<br>");
 out.println("sum = " + add(10, 23));
%>
</h2>
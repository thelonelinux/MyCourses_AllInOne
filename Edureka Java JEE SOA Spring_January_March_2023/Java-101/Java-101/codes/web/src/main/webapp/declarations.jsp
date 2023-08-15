<%!
 String companyName = "edureka limited"; //instance variable
 
 public int add(int x , int y){
	 return x + y;
 }
%>
<h2>
<%
 out.println("my company name = " + companyName + "<br>"); 
 out.println("sum = " + add(11, 23));
%>
</h2>
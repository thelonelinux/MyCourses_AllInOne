<%!
 String companyName = "edureka limited"; //instance variable
 
 public int add(int x , int y){
	 return x + y;
 }
%>
<h2>
my company name = <%=companyName %>
<br><br>
<%="11 + 43 = " + add(11, 43) %>
</h2>
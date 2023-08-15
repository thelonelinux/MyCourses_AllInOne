<%!
 String companyName = "edureka limited";
 
 public int add(int x, int y){
	 return x + y;
 }
%>

<h2>
company name = <%=companyName %>
<br><br>
<%="sum = " + add(12,23) %>
</h2>
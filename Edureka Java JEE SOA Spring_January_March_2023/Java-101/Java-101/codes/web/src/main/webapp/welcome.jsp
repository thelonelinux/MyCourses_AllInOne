<html>
 <head>
 	<title>JSP</title>
 	<style>
 		body{
 		  text-align:center;
 		  background:linear-gradient(to right, orange, white, green);
 		}
 	</style>
 </head>
 <body>
 	<h1>
 	 <%
 	   out.println("edureka limited");
 	 %>
 	</h1>
 	<h3>
 	 <%
 	   out.println("bangalore, karnataka, India");
 	 %>
 	</h3>
 	<h2 style="text-align:left">
 	 <%
 	   int a = 10; //local variables
 	   int b = 22;
 	   int c = a + b;
 	   out.println(a + " + " + b + " = " + c);
 	 %>
 	</h2>
 </body>
</html>
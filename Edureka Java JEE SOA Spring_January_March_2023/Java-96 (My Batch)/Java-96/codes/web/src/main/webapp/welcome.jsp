<html>
 <head>
 	<title>jsp page</title>
 	<style>
 		body{
 		  background:linear-gradient(to right, orange, white, green);
 		  text-align:center;
 		  font-family:'comic sans ms', serif;
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
 			out.println("bangalore, karnataka, India<br><br>");
 			String courseName= "Java Certification Training";
 			out.println(courseName);
 		%>
 	</h3>
 </body>
</html>
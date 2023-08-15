<h2>
<%
 String uid = request.getParameter("txt_uid");
 out.println("username = " + uid);
%>
<br><br>
user name = ${param.txt_uid}
</h2>
<hr>
<h2>
<%
 String uid1 = request.getParameter("txt_uidd");
 out.println("username = " + uid1);
%>
<br><br>
user name = ${param.txt_uidd}

</h2>
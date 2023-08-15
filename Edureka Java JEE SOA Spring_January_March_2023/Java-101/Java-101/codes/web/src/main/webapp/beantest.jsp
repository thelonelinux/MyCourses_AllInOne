<jsp:useBean id="acc" class="co.edureka.web.models.Account"></jsp:useBean>
<h2>
A/C No: <jsp:getProperty property="accountNo" name="acc"/> <br>
A/C Name: <jsp:getProperty property="accountName" name="acc"/> <br>
A/C Balance: <jsp:getProperty property="accountBal" name="acc"/> <br>
</h2>
<hr>

<jsp:setProperty name="acc" property="accountName" value="Sanjay Patil"/>
A/C Name: <jsp:getProperty property="accountName" name="acc"/>
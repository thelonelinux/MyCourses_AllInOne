<jsp:useBean class="co.edureka.web.models.Account" id="acc"></jsp:useBean>
<h2>
A/C No: <jsp:getProperty property="accountNo" name="acc"/> <br>
A/C Name: <jsp:getProperty property="accountName" name="acc"/> <br>
A/C Balance: <jsp:getProperty property="accountBal" name="acc"/>
</h2>
<hr>
<h2>
<jsp:setProperty property="accountName" name="acc" value="Sunil Joseph"/>
A/C Name: <jsp:getProperty property="accountName" name="acc"/>
</h2>
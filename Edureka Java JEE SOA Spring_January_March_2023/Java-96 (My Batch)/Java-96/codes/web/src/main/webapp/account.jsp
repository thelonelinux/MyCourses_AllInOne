<jsp:useBean class="co.edureka.web.models.Account" id="acc"></jsp:useBean>

<jsp:setProperty property="*" name="acc"/>

<h2>
A/C No: <jsp:getProperty property="accountNo" name="acc"/> <br>
A/C Name: <jsp:getProperty property="accountName" name="acc"/> <br>
A/C Balance: <jsp:getProperty property="accountBal" name="acc"/>
</h2>

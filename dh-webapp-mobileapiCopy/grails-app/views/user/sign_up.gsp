<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Form</title>
	</head>
	<body>
        <g:form controller="User" action="save">
        	<label>Facebook: </label>
            <g:textField name="facebook"/><br/>
            <label>Name: </label>
            <g:textField name="name"/><br/>
            <label>Email: </label>
            <g:textField name="email"/><br/>
            <label>Password: </label>
            <g:textField name="email"/><br/>
            <label>Phone: </label>
            <g:textField name="phone"/><br/>
            <label>Refferal Code: </label>
            <g:textField name="refferalCode"/><br/>
            <g:actionSubmit value="save"/>
        </g:form>
	</body>
</html>
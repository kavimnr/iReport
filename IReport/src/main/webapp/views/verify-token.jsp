<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<link href="/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="/js/bootstrap.min.js"></script>
<script src="/jquery/jquery.min.js"></script>
<link href="/css/login-style.css" rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Verify Token</title>
</head>
<body>
<div id="token">
		<h4 class="text-center text-info"><font color="yellow">User Name: ${uname}</font></h4>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="verify-user" class="form" action="/verifyToken">
                            <h3 class="text-center text-info"><font color="yellow">Please check your mail and enter verification code.</font></h3>
                            <div class="form-group">
                                <label for="token" class="text-info"><font color="yellow">Enter Verification code here</font></label><br>
                                <input type="text" name="token" id="token" class="form-control" required>
                            </div>
                            <input type="hidden" name="uname" value="${uname}">
                            <div class="form-group">
                                <input type="submit" class="btn btn-info btn-md" value="Verify">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
</div>
</body>
</html>
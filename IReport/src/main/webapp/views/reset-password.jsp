<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="/js/bootstrap.min.js"></script>
<script src="/jquery/jquery.min.js"></script>
<link href="/css/login-style.css" rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<div id="login">
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="/resetPassword">
                            <h3 class="text-center text-info">Change Password</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Enter Your Username</label><br>
                                <input type="text" name="uname" id="username" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Enter Your Old Password</label><br>
                                <input type="password" name="oldPassword" id="password" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Enter Your New Password</label><br>
                                <input type="password" name="newPassword" id="password" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Confirm New Password</label><br>
                                <input type="password" name="confirmPassword" id="password" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-info btn-md" value="Change Password">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
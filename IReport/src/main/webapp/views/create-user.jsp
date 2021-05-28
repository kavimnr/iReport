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
<title>Create New User !</title>
</head>
<body>
<div id="create">
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="create-user" class="form" action="/createUser">
                            <h3 class="text-center text-info"><font color="yellow">Create New User</font></h3>
                            <div class="form-group">
                                <label for="username" class="text-info"><font color="yellow">Enter Username</font></label><br>
                                <input type="text" name="uname" id="username" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-info btn-md" value="Create">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
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
<title>Delete User</title>
</head>
<body>
<div id="delete">
        <div class="container">
            <div id="delete" class="row justify-content-center align-items-center">
                <div id="delete-column" class="col-md-6">
                    <div id="delete-box" class="col-md-12">
                        <form id="delete-user" class="form" action="/deleteUser">
                            <h3 class="text-center text-info"><font color="yellow">Delete User</font></h3>
                            <div class="form-group">
                                <label for="username" class="text-info"><font color="yellow">Enter Username</font></label><br>
                                <input type="text" name="uname" id="username" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-info btn-md" value="Delete">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>		
</body>
</html>
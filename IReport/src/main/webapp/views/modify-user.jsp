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
<title>Modify User</title>
</head>
<body>
		
		<div id="modify">
        <div class="container">
            <div id="modify" class="row justify-content-center align-items-center">
                <div id="modify-column" class="col-md-6">
                    <div id="modify-box" class="col-md-12">
                        <form id="modify-user" class="form" action="/modifyUser">
                            <h3 class="text-center text-info"><font color="yellow">Modify User</font></h3>
                            <div class="form-group">
                                <label for="username" class="text-info"><font color="yellow">Enter Username</font></label><br>
                                <input type="text" name="uname" id="username" class="form-control" required>
                            </div>
                            <label for="role"><font color="yellow">Choose Role</font></label>
                            <select name="role" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" required>
                            	 <option value="member">Member</option>
 			 					 <option value="lead">Lead</option>
 			 					 <option value="manager">Manager</option>
 			 					 <option value="admin">Admin</option>
							</select>
							<br>
                            <div class="form-group">
                                <input type="submit" class="btn btn-info btn-md" value="Update">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
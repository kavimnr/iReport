<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="/js/bootstrap.min.js"></script>
<script src="/jquery/jquery.min.js"></script>
<link href="/css/alignment.css" rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
		<div class="header">
  			<h1><font color="red">iReport</font><br/></h1>
  			<p>An Automotive portal to send reports in click. </p>
		</div>
		
		<h3><font color="yellow">SELECT REPORTS AND CLICK SEND/DOWNLOAD<font/></h3><br/>
		<form action="/sendReport">
		<select name="report" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true" required>
 			 <option value="employee_details">All employees details</option>
		</select>
		<input type="submit" class="btn btn-info btn-md" name="submit" value="Send">
        <input type="submit" class="btn btn-info btn-md" name="submit" value="Download">
		</form>
</body>
</html>
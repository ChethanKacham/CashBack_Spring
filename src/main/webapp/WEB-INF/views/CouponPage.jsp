<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Your Current Balance is "${balance}"</h2>
<h3>Claim Your CashBack Here</h3>
<form action="validatecoupon" method="post">
Enter Coupon Code:<input type="text" name="ccode"><br/>
<input type="submit" value="Claim"> 
</form>
</body>
</html>
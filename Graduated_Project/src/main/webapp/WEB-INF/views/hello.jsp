<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<meta charset="utf-8">

<title>Insert title here</title>

</head>
<body>
	<i th:text="${message}"></i>
	<form action="/login" method="post">
	 <h4><a th:href="/@{/oauth2/authorization/google}">Login with Google</a></h4> 
		<input name="username"><br>
		<input name="password"><br>
		<button>Login</button>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!--<c:import url="inc/head.jsp" />-->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Hellenic</title>

 <link type="text/css" rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>" />
 <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css"/>" />
</head>
<body>
	<div class="container">
		<c:import url="inc/header.jsp" />
		<section>
			<h1>Contact</h1>
			<article>
				<p>
					Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
					tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
					quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
					consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
					cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
					proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
				</p>
				<form action="/admin/contact" method="post" class="form-horizontal">
					<div class="control-group">
						<input type="text" name="login" placeholder="Login" >
					</div>
					<div class="control-group">
						<input type="password" name="pwd" placeholder="PassWord">
					</div>
					<input type="submit" value="Validez" class="btn btn-primary">
				</form>
			</article>
		</section>
		<c:import url="inc/footer.jsp" />
	</div>
</html>
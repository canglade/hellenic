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
		<div class="page-header">
		    <h2>Réservation</h2>
		</div>
		<section class="row-fluid" id="biens">
		<c:if test="${ biens }" >
			<c:forEach var="i" begin="0" end="10" step="1">
				<div class="span3 bien">
					<img src="<c:url value="/img/Arg026-poolandhouse.jpg"/>" class="img-rounded img-bien">
					<p class="titre"><strong><c:out value="${ bien.get(i).libelle }"/></strong></p>
					<p><c:out value="${ bien.get(i).prix }"/></p>
					<p><a href="/affiche-bien&id=<c:out value="${ bien.get(i).ref }"/>">Voir</a></p>
				</div>
			</c:forEach>	    
		</c:if>
		</section>
		<c:import url="inc/footer.jsp" />
	</div>
</html>
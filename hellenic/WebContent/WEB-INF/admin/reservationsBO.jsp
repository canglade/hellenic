<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Hellenic</title>

 <link type="text/css" rel="stylesheet" href="css/bootstrap.css" />
 <link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		
		<nav class="navbar">
		    <div class="navbar-inner">
		    <ul class="nav">
			    <li class="active"><a href="#">Réservation</a></li>
			    <li><a href="#">...</a></li>
			    <li><a href="#">...</a></li>
		    </ul>
			<a href="" class="btn btn-danger" title="Déconnexion"><i class="icon-off icon-white"></i> Déconnexion</a>
		    </div>
		</nav>
		<section>
		    <div class="page-header">
		    	<h2>Réservation</h2>
		    </div>
		    <div class="alert alert-success">
			    <strong>Success!</strong> Opération réussie.
		    </div>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Num</th>
						<th>Propriété</th>
						<th>Nom Prénom</th>
						<th>E-mail</th>
						<th>Pays</th>
						<th>Téléphone</th>
						<th>Date résa</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>003</td>
						<td>Simpson Bart</td>
						<td>toto@gmail.com</td>
						<td>France</td>
						<td>0000000000</td>
						<td>12/12/2012</td>
						<td><a href="" title="Supprimer"><i class="icon-trash"></i></a></td>
					</tr>
					<tr>
						<td>003</td>
						<td>Simpson Bart</td>
						<td>toto@gmail.com</td>
						<td>France</td>
						<td>0000000000</td>
						<td>12/12/2012</td>
						<td><i class="icon-trash"></i></td>
					</tr>
					<tr>
						<td>003</td>
						<td>Simpson Bart</td>
						<td>toto@gmail.com</td>
						<td>France</td>
						<td>0000000000</td>
						<td>12/12/2012</td>
						<td><i class="icon-trash"></i></td>
					</tr>
					<tr>
						<td>003</td>
						<td>Simpson Bart</td>
						<td>toto@gmail.com</td>
						<td>France</td>
						<td>0000000000</td>
						<td>12/12/2012</td>
						<td><i class="icon-trash"></i></td>
					</tr>
				</tbody>
			</table>
		</section>

	</div>
</html>
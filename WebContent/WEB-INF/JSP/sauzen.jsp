<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="nl">
	<head>
		<c:import url="/WEB-INF/JSP/head.jsp">
			<c:param name="title" value="Sauzen"/>
		</c:import>
	</head>
	<body>
		<h1>Sauzen</h1>
		<ul>
			<c:forEach var="saus" items="${sauzen}">
				<h2>${saus.naam}</h2>
				<img alt="${saus.naam}" src="images/${saus.naam}.png" class="saus">
					<h3>Ingrediënten</h3>
					<ul>
						<c:forEach var="ingrediënt" items="${saus.ingrediënten}">
							<li>${ingrediënt}</li>
						</c:forEach>
					</ul>
			</c:forEach>
		</ul>
	</body>
</html>
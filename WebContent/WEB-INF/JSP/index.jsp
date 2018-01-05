<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<!doctype html>
<html>
	<head>
		<title>Frituur Frida</title>
		<link rel="icon" href="images/favicon.ico">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="styles/frituurFrida.css">
	</head>
	<body>
		<h1>Frituur Frida</h1>
		<h2>Vandaag zijn we ${openGesloten}</h2>
		<img alt="${openGesloten}" src="images/${openGesloten}.png">
	</body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--Normalize-->
        <link rel="stylesheet" href="css/normalize.css">

        <!-- Fuentes -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=PT+Sans:wght@400;700&display=swap" rel="stylesheet">   

        <!-- Estilos -->
        <link rel="stylesheet" href="css/globales.css">
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/footer.css">

        <title>COTECH</title>
    </head>
    <body>
        <jsp:include page="paginas/comunes/header.jsp"></jsp:include>

        <jsp:include page="paginas/comunes/main.jsp"></jsp:include>

        <jsp:include page="paginas/comunes/footer.jsp"></jsp:include>
    </body>
</html>

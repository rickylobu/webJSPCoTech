
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Administrador</title>

      <!--Normalize-->
      <link rel="stylesheet" href="css/normalize.css">

      <!-- Fuentes -->
      <link rel="preconnect" href="https://fonts.googleapis.com">
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
      <link href="https://fonts.googleapis.com/css2?family=PT+Sans:wght@400;700&display=swap" rel="stylesheet">   

      <!-- Estilos -->
      <link rel="stylesheet" href="css/globales.css">
      <link rel="stylesheet" href="css/header2.css">
      

      <!-- Bootstrap CSS -->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
      crossorigin="anonymous">

</head>
<body>

  
    <header class="header2">
        <div class="">
            <h1 class="titulo">CRUD COTECH</h1>
        </div>
        <nav class="nav2">
            <a class="cerrar" href="#">Cerrar Secion</a>
        </nav>
    </header>

    <main class="main2">
        <aside class="menu">
            <ul>
                <li><a class="item" href="admin_equipos.jsp"> Equipos </a></li>
                <li><a class="item" href="admin_clientes.jsp"> Clientes </a></li>
                <li><a class="item" href="#">Usuarios</a></li>
                <li><a class="item" href="#"> Compras</a></li>
                <li><a class="item" href="admin_departamentos.jsp"> Departamento</a></li>
                <li><a class="item" href="admin_proveedores.jsp"> Proveedor</a></li>
            </ul>
        </aside>  
       
       
         <jsp:include page="WEB-INF/paginas/proveedores/lista_proveedores.jsp"></jsp:include>
         
    </main>
    
      <!-- Option 1: Bootstrap Bundle with Popper -->
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" 
      integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" 
      crossorigin="anonymous"></script>

</body>
</html>


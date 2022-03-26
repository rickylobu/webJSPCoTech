<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>

<section class="crud">
    <!--<input class="btn-agregar" type="submit"  name="Agregar Equipo" value="Agregar"> 
    <button type="btn-agregar button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"
    data-bs-whatever="@mdo">Agregar</button>-->
    <button type="btn-agregar button" class="btn-agregar" data-bs-toggle="modal" data-bs-target="#exampleModal"
            data-bs-whatever="@mdo">Agregar</button>
    <h3 class="titulo-tabla">Lista De Departamentos</h3>
    <table class="tabla">
        <!--<caption class="titulo-tabla">Lista De Equipos De Computo</caption>-->
        <tr>
            <th>Id_departamento</th>
            <th>Nombre</th>
            <th>Acción</th>
        </tr>
         <tr>
             <c:forEach var="departamento" items="${departamentos}" varStatus="status">
            <td>${departamento.id_departamento}</td>
            <td>${departamento.nombre}</td>
            <td style="margin: 0 auto;" class="botones">
                <input class="btn-editar" type="submit" name="Editar" value="Editar">  
                <input class="btn-eliminar" type="submit" name="Eliminar" value="Eliminar"> 
            </td>
             </c:forEach>
        </tr>
    </table>
</section>



<!--incluir form aqui-->
<jsp:include page="agregar_departamento.jsp"></jsp:include>

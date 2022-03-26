<section class="crud">
    <!--<input class="btn-agregar" type="submit"  name="Agregar Equipo" value="Agregar"> 
    <button type="btn-agregar button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"
    data-bs-whatever="@mdo">Agregar</button>-->
    <button type="btn-agregar button" class="btn-agregar" data-bs-toggle="modal" data-bs-target="#exampleModal"
            data-bs-whatever="@mdo">Agregar</button>
    <h3 class="titulo-tabla">Lista De Proveedores</h3>
    <table class="tabla">
        <!--<caption class="titulo-tabla">Lista De Equipos De Computo</caption>-->
        <tr>
            <th>Id_proveedor</th>
            <th>Nombre</th>
            <th>Calle</th>
            <th>Colonia</th>
            <th>CP</th>
            <th>Número</th>
            <th>Estado</th>
            <th>Telefono</th>
            <th>Acción</th>
        </tr>
        <tr>
            <td>1</td>
            <td>HP</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td style="margin: 0 auto;" class="botones">
                <input class="btn-editar" type="submit" name="Editar" value="Editar">  
                <input class="btn-eliminar" type="submit" name="Eliminar" value="Eliminar"> 
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>HP</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td style="margin: 0 auto;" class="botones">
                <input class="btn-editar" type="submit" name="Editar" value="Editar">  
                <input class="btn-eliminar" type="submit" name="Eliminar" value="Eliminar"> 
            </td>
        </tr>
        <tr>
            <td>1</td>
            <td>HP</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td>Hola</td>
            <td style="margin: 0 auto;" class="botones">
                <input class="btn-editar" type="submit" name="Editar" value="Editar">  
                <input class="btn-eliminar" type="submit" name="Eliminar" value="Eliminar"> 
            </td>
        </tr>
      
       

    </table>
</section>



<!--incluir form aqui-->
<jsp:include page="agregar_proveedor.jsp"></jsp:include>
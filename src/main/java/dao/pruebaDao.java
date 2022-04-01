/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Cliente;
import dominio.ClienteUsuario;
import dominio.Compra;
import dominio.Departamento;
import dominio.Detalle;
import dominio.Equipo;
import dominio.EquipoProveedor;
import dominio.Provedor;
import dominio.Usuario;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Ricardo
 */
public class pruebaDao {

    public static void main(String[] args) throws SQLException {

        //___________________________________________________________
        //_______________PRUEBAS DE USUARIO_____________________
        
        
        //__________________prueba insertar usuario_____________________
        /*
        Usuario usr=new Usuario(0,"correo@ejemploDao","ejemplo para gael","1234");
                
        
        try{
        DaoUsuario dao =new DaoUsuarioImpl();
        dao.Registrar(usr);
        System.out.println("usuario agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Usuario no agregado ");
        }
         */
        //_________________prueba Modificar Usuario_____________________ 
        /*
        int id =4;
         Usuario usr=new Usuario(id,"correo@ejemploDao","ChingonsioModificado","1234");
                
        
        try{
        DaoUsuario dao =new DaoUsuarioImpl();
        dao.Modificar(usr);
        System.out.println("usuario modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("usuario no modificado");

        }
        
         */
        //__________________Prueba eliminar usuario_____________________
        /*
        int id =4;
         
        Usuario usr=new Usuario(id,"correo@ejemploDao","ChingonsioModificado","1234");
                
        
        try{
        DaoUsuario dao =new DaoUsuarioImpl();
        dao.Eliminar(usr);
        System.out.println("usuario eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("usuario no eliminado");

        }
        
         */
        //__________________prueba listar Usuarios_____________________
        
        try{
        DaoUsuario dao =new DaoUsuarioImpl();
        for (Usuario u : dao.Listar()){
            System.out.println(u.getId_usuario()+"  "+u.getEmail()+"  "+u.getNombre_usuario()+"  "+u.getContraseña());
        }
        
        System.out.println("____Usuarios Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("usuarios no listados");

        }
        
         
        //__________________prueba Buscar Usuario por Id_____________________
        /*
        try{
        DaoUsuario dao =new DaoUsuarioImpl();
        int idBus=1;
        Usuario u= dao.BusUsrXId(idBus);
            System.out.println(u.getId_usuario()+"  "+u.getEmail()+"  "+u.getNombre_usuario()+"  "+u.getContraseña());
        
        
        System.out.println("____Usuario encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("usuario no encontrado");

        }
        
         */
        //___________________________________________________________
        //_______________PRUEBAS DE DEPARTAMENTO_____________________
        
        //__________________prueba insertar departamento_____________________
        /*
        
        Departamento depto=new Departamento(0,"pruebaDeptoDao");
                
        
        try{
        DaoDepartamento dao =new DaoDepartamentoImpl();
        dao.Registrar(depto);
        System.out.println("departamento agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Departamento no agregado ");
        }
         
        */
        
        //_________________prueba Modificar Departamento_____________________ 
        
        /*
        int id =21;
         Departamento depto=new Departamento(id,"DeptoModificado");
                
        
        try{
        DaoDepartamento dao =new DaoDepartamentoImpl();
        dao.Modificar(depto);
        System.out.println("Departamento modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Departamento no modificado");

        }
        */
         
        //__________________Prueba eliminar Departamento_____________________
        /*
        int id =21;
         
        Departamento depto=new Departamento(id,"NombreDeptox");
                
        
        try{
        DaoDepartamento dao =new DaoDepartamentoImpl();
        dao.Eliminar(depto);
        System.out.println("Departamento eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Departamento no eliminado");

        }
        */
         
        //__________________prueba listar Departamento_____________________
        /*
        try{
        DaoDepartamento dao =new DaoDepartamentoImpl();
        for (Departamento d : dao.Listar()){
            System.out.println(d.getId_departamento()+"  "+d.getNombre());
        }
        
        System.out.println("Departamentos Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Departamentos no listados");

        }

        */ 
        
        //__________________prueba Buscar Departamento por Id_____________________
        
        /*
        try{
        DaoDepartamento dao =new DaoDepartamentoImpl();
        int idBus=1;
        Departamento d= dao.BusDeptoXId(idBus);
            System.out.println(d.getId_departamento()+"  "+d.getNombre());
        
        
        System.out.println("____Departamento encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Departamento no encontrado");

        }
        
        */ 
        
        
        //___________________________________________________________
        //_______________PRUEBAS DE EQUIPO_____________________
        
        //__________________prueba insertar equipo_____________________
        
        /*
        Equipo eq= new Equipo(0, 2, "NombreEquipo2", "Procesador2", "SisOp2", "Memoria2", "Pantalla2", "Ram2", 10560.90, "imagen2");
        
        try{
        DaoEquipo dao =new DaoEquipoImpl();
        dao.Registrar(eq);
        System.out.println("Equipo agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Equipo no agregado ");
        }
         
        */
        
        
        //_________________prueba Modificar Equipo_____________________ 
        
        /*
        Equipo eq= new Equipo(2, 2, "NomModificadoEquipo", "ProcesadorMod", "SisOpMod", "MemoriaMod", "PantallaMod", "RamMod", 16660.50, "imagenMod");
                
        
        try{
        DaoEquipo dao =new DaoEquipoImpl();
        dao.Modificar(eq);
        System.out.println("Equipo modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Equipo no modificado");

        }
        */
         
        //__________________Prueba eliminar Equipo_____________________
        /*
        int id =2;
         
        Equipo eq= new Equipo(2, 2, "NomModificadoEquipo", "ProcesadorMod", "SisOpMod", "MemoriaMod", "PantallaMod", "RamMod", 16660.50, "imagenMod");
                
        
        try{
        DaoEquipo dao =new DaoEquipoImpl();
        dao.Eliminar(eq);
        System.out.println("Equipo eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Equipo no eliminado");

        }
        */
         
        //__________________prueba listar Equipo_____________________
        /*
        try{
        DaoEquipo dao =new DaoEquipoImpl();
        System.out.println("id_Equipo     id_Depatamento     Nombre          Procesador     Sist. Operativo     Memoria     Pantalla     Ram     Precio     imagen");
        for (Equipo eq : dao.Listar()){
            System.out.println("   "+eq.getId_equipo()+"             "+eq.getId_departamento()+"              "+eq.getNombre()+"      "+eq.getProcesador()+"          "+eq.getSistema_operativo()
                    +"           "+eq.getMemoria()+"       "+eq.getPantalla()+"    "+eq.getRam()+"    "+eq.getPrecio()+"    "+eq.getImagen());
        }
        
        System.out.println("____Equipos Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Equipos no listados");

        }

        */
        
        //__________________prueba Buscar Equipo por Id_____________________
        
        /*
        try{
        DaoEquipo dao =new DaoEquipoImpl();
        int idBus=3;
        Equipo eq= dao.BusEquipoXId(idBus);
            System.out.println("id_Equipo     id_Depatamento     Nombre          Procesador     Sist. Operativo     Memoria     Pantalla     Ram     Precio     imagen");
            System.out.println("   "+eq.getId_equipo()+"             "+eq.getId_departamento()+"              "+eq.getNombre()+"      "+eq.getProcesador()+"          "+eq.getSistema_operativo()
            +"           "+eq.getMemoria()+"       "+eq.getPantalla()+"    "+eq.getRam()+"    "+eq.getPrecio()+"    "+eq.getImagen());
        
        
        System.out.println("____Equipo encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Equipo no encontrado");

        }
        
        */
        
        
        
        //___________________________________________________________
        //_______________PRUEBAS DE CLIENTES_____________________
        
        //__________________prueba insertar Cliente_____________________
        
        /*
        Cliente cl= new Cliente(0, "nombre2", "calle2", "colonia2", "cp2", "numero2", "estado2", "telefono2", "email2");
        
        try{
        DaoCliente dao =new DaoClienteImpl();
        dao.Registrar(cl);
        System.out.println("Cliente agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Cliente no agregado ");
        }
         
        */
        
        
        //_________________prueba Modificar Cliente_____________________ 
        
        /*
        Cliente cl= new Cliente(1, "nombreModificado", "calleMod", "coloniaMod", "cpMod", "numeroMod", "estadoMod", "telefonoMod", "emailMod");
                
        
        try{
        DaoCliente dao =new DaoClienteImpl();
        dao.Modificar(cl);
        System.out.println("Cliente modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Cliente no modificado");

        }
        */
         
        //__________________Prueba eliminar Cliente_____________________
        
        /*
        Cliente cl= new Cliente(1, "nombreModificado", "calleMod", "coloniaMod", "cpMod", "numeroMod", "estadoMod", "telefonoMod", "emailMod");
                
        
        try{
        DaoCliente dao =new DaoClienteImpl();
        dao.Eliminar(cl);
        System.out.println("Cliente eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Cliente no eliminado");

        }
        */
         
        //__________________prueba listar Cliente_____________________
        /*
        try{
        DaoCliente dao =new DaoClienteImpl();
        System.out.println("id_Cliente     nombre     calle          colonia     codPostal     numero     estado     teléfono     email");
        for (Cliente c : dao.Listar()){
            System.out.println("   "+c.getId_cliente()+"             "+c.getNombre()+"              "+c.getCalle()+"      "+c.getColonia()+"          "+c.getCp()
                    +"           "+c.getNumero()+"       "+c.getEstado()+"    "+c.getTelefono()+"    "+c.getEmail());
        }
        
        System.out.println("____Cliente Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Cliente no listados");

        }

        */
        
        //__________________prueba Buscar Cliente por Id_____________________
        
        /*
        try{
        DaoCliente dao =new DaoClienteImpl();
        int idBus=2;
        Cliente c= dao.BusClienteXId(idBus);
        System.out.println("id_Cliente     nombre     calle          colonia     codPostal     numero     estado     teléfono     email");
        System.out.println("   "+c.getId_cliente()+"             "+c.getNombre()+"              "+c.getCalle()+"      "+c.getColonia()+"          "+c.getCp()
                            +"           "+c.getNumero()+"       "+c.getEstado()+"    "+c.getTelefono()+"    "+c.getEmail());
        
        
        System.out.println("____Cliente encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Cliente no encontrado");

        }
        */
        
        
        
        //_______________PRUEBAS DE PROVEEDORES_____________________
        
        //__________________prueba insertar Proveedor_____________________
        
        /*
        Provedor pr= new Provedor(0, "nombre2", "calle2", "colonia2", "cp2", "numero2", "estado2", 551255000);
        
        try{
        DaoProvedor dao =new DaoProvedorImpl();
        dao.Registrar(pr);
        System.out.println("Provedor agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedor no agregado ");
        }
         
        */
        
        
        //_________________prueba Modificar Proveedor_____________________ 
        
        /*
        Provedor pr= new Provedor(1, "nombreModificado", "calleMod", "coloniaMod", "cpMod", "numeroMod", "estadoMod", 551511889);
                
        
        try{
        DaoProvedor dao =new DaoProvedorImpl();
        dao.Modificar(pr);
        System.out.println("Provedor modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedor no modificado");

        }
        
         */
        //__________________Prueba eliminar Provedor_____________________
        
        /*
        Provedor pr= new Provedor(1, "nombreModificado", "calleMod", "coloniaMod", "cpMod", "numeroMod", "estadoMod", 551944556);
                
        
        try{
        DaoProvedor dao =new DaoProvedorImpl();
        dao.Eliminar(pr);
        System.out.println("Provedor eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedor no eliminado");

        }
        */
         
        //__________________prueba listar Provedor_____________________
        /*
        try{
        DaoProvedor dao =new DaoProvedorImpl();
        System.out.println("id_Proveedor     nombre     calle          colonia     codPostal     numero     estado     teléfono    ");
        for (Provedor p : dao.Listar()){
            System.out.println("   "+p.getId_provedor()+"             "+p.getNombre()+"              "+p.getCalle()+"      "+p.getColonia()+"          "+p.getCp()
                    +"           "+p.getNumero()+"       "+p.getEstado()+"    "+p.getTelefono());
        }
        
        System.out.println("____Provedores Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedores no listados");

        }

        */
        
        //__________________prueba Buscar Provedor por Id_____________________
        
        /*
        try{
        DaoProvedor dao =new DaoProvedorImpl();
        int idBus=2;
        Provedor p= dao.BusProvedorXId(idBus);
        System.out.println("id_Cliente     nombre     calle          colonia     codPostal     numero     estado     teléfono     email");
        System.out.println("   "+p.getId_provedor()+"             "+p.getNombre()+"              "+p.getCalle()+"      "+p.getColonia()+"          "+p.getCp()
                            +"           "+p.getNumero()+"       "+p.getEstado()+"    "+p.getTelefono());
        
        
        System.out.println("____Provedor encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedor no encontrado");

        }
        
        */
        
        //_______________PRUEBAS DE COMPRAS_____________________
        
        //__________________prueba insertar Compra_____________________
        
       /*
        Date fecha = new Date();
        fecha.getTime();
        
        Compra co = new Compra(0, 2, 18300.56,fecha);
        
        try{
        DaoCompra dao =new DaoCompraImpl();
        dao.Registrar(co);
        System.out.println("Compra agregada con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Compra no agregada ");
        }
        
        */
        
        
        
        //_________________prueba Modificar Compra_____________________ 
        /*
        Date fecha = new Date();
        fecha.getTime();
        
        Compra co = new Compra(1, 2, 10000.56,fecha);
        
        
        try{
        DaoCompra dao =new DaoCompraImpl();
        dao.Modificar(co);
        System.out.println("Compra modificada con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Compra no modificada");

        }
        */
         
        //__________________Prueba eliminar Compra_____________________
        /*
        Date fecha = new Date();
        fecha.getTime();
        
        Compra co = new Compra(3, 2, 10000.56,fecha);
   
        try{
        DaoCompra dao =new DaoCompraImpl();
        dao.Eliminar(co);
        System.out.println("Compra eliminada con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Compra no eliminada");

        }
        */
         
        //__________________prueba listar Compras_____________________
        /*
        try{
        DaoCompra dao =new DaoCompraImpl();
        System.out.println("id_compra   id_usuario     total      fecha");
        for (Compra c : dao.Listar()){
            Date fech = new Date(c.getFecha().getTime());
            System.out.println("   "+c.getId_compra()+"    "+c.getId_usuario()+"      "+c.getTotal()+"      "+fech);
        }
        
        System.out.println("____Provedores Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedores no listados");

        }
        */
        
        
        //__________________prueba Buscar Compra por Id_____________________
        
        /*
        try{
        DaoCompra dao =new DaoCompraImpl();
        int idBus=2;
        Compra c= dao.BusCompraXId(idBus);
        System.out.println("id_compra   id_usuario     total      fecha");
        
        Date fech = new Date(c.getFecha().getTime());
        System.out.println("   "+c.getId_compra()+"    "+c.getId_usuario()+"      "+c.getTotal()+"      "+fech);

        System.out.println("____Provedor encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Provedor no encontrado");

        }
        */
        
        
        //_______________PRUEBAS DE DETALLE_____________________
        
        //__________________prueba insertar Detalle_____________________
        
        /*
        Detalle det= new Detalle(2, 3, 1, 10560.99, 10560.99);
        
        try{
        DaoDetalle dao =new DaoDetalleImpl();
        dao.Registrar(det);
        System.out.println("Detalle agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Detalle no agregado ");
        }
        
        */
        
        
        
        //_________________prueba Modificar Detalle_____________________ 
        
        /*
        Detalle det= new Detalle(1, 3, 2, 10560.99, 21121.98);
                
        
        try{
        DaoDetalle dao =new DaoDetalleImpl();
        dao.Modificar(det);
        System.out.println("Detalle modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Detalle no modificado");

        }
        
        */
        
        //__________________Prueba eliminar Detalle_____________________
        
        /*
        Detalle det= new Detalle(1, 3, 2, 10560.99, 21121.98);
                
        
        try{
        DaoDetalle dao =new DaoDetalleImpl();
        dao.Eliminar(det);
        System.out.println("Detalle eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Detalle no eliminado");

        }
          
        */
        
        //__________________prueba listar todo el Detalle_____________________
        /*
        try{
        DaoDetalle dao =new DaoDetalleImpl();
        System.out.println("id_Compra     id_equipo     cantidad      precio     total ");
        for (Detalle det : dao.Listar()){
            System.out.println(det.getId_compra()+"             "+det.getId_equipo()+"              "+det.getCantidad()+"      "+det.getPrecio()+"          "+det.getTotal());
        }
        
        System.out.println("____Detalle Listado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Detalle no listado");

        }

        */
        
        
        //__________________prueba listar Detalle por Id_Compra_____________________
        /*
        int id_compra=1;
        try{
        DaoDetalle dao =new DaoDetalleImpl();
        System.out.println("id_Compra     id_equipo     cantidad      precio     total ");
        for (Detalle det : dao.BusDetalleXId(id_compra)){
            System.out.println(det.getId_compra()+"             "+det.getId_equipo()+"              "+det.getCantidad()+"      "+det.getPrecio()+"          "+det.getTotal());
        }
        
        System.out.println("____Detalle Listado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Detalle no listado");

        }

        */
        
        //___________________________________________________________
        //_______________PRUEBAS DE CLIENTES_USUARIOS_____________________
        
        //__________________prueba insertar ClienteUsuario_____________________
        
        /*
        ClienteUsuario cu= new ClienteUsuario(3, 2);
        
        try{
        DaoClienteUsuario dao =new DaoClienteUsuarioImpl();
        dao.Registrar(cu);
        System.out.println("Cliente_Usuario agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Cliente_Usuario no agregado ");
        }
         
        
        */
        
        //_________________prueba Modificar ClienteUsuario_____________________ 
        
        /*
        ClienteUsuario cu= new ClienteUsuario(3, 1);
                
        
        try{
        DaoClienteUsuario dao =new DaoClienteUsuarioImpl();
        dao.Modificar(cu);
        System.out.println("ClienteUsuario modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("ClienteUsuario no modificado");

        }
        
        */ 
        //__________________Prueba eliminar ClienteUsuario_____________________
        
        /*
        ClienteUsuario cu= new ClienteUsuario(3, 1);
                
        
        try{
        DaoClienteUsuario dao =new DaoClienteUsuarioImpl();
        dao.Eliminar(cu);
        System.out.println("ClienteUsuario eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("ClienteUsuario no eliminado");

        }
         
         */
        //__________________prueba listar ClienteUsuario_____________________
        /*
        try{
        DaoClienteUsuario dao =new DaoClienteUsuarioImpl();
        System.out.println("id_Cliente   id_Usuario");
        for (ClienteUsuario cu : dao.Listar()){
            System.out.println("   "+cu.getId_cliente()+"     "+cu.getId_usuario());
        }
        
        System.out.println("____ClienteUsuario Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("ClienteUsuario no listados");

        }

        */
        
        //_________________prueba Buscar Cliente por Id_Usuario_____________________
        
        /*
        try{
        DaoClienteUsuario dao =new DaoClienteUsuarioImpl();
        int idBus=2;
        ClienteUsuario cu= dao.BusClienteXIdUsuario(idBus);
        System.out.println("id_Cliente   id_Usuario");
        System.out.println("   "+cu.getId_cliente()+"     "+cu.getId_usuario());

        System.out.println("____ClienteUsuario encontrado con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("ClienteUsuario no encontrado");

        }
        
        */
        
        
        //___________________________________________________________
        //_______________PRUEBAS DE EQUIPO_PROVEEDOR_____________________
        
        //__________________prueba insertar EquipoProveedor_____________________
        
        /*
        
        EquipoProveedor eqp= new EquipoProveedor(4, 3);
        
        try{
        DaoEquipoProveedor dao =new DaoEquipoProveedorImpl();
        dao.Registrar(eqp);
        System.out.println("EquipoProveedor agregado con exito ");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("EquipoProveedor no agregado ");
        }
         
        */
        
        
        //_________________prueba Modificar EquipoProveedor_____________________ 
        
        /*
        EquipoProveedor eqp= new EquipoProveedor(3, 3);
                
        
        try{
        DaoEquipoProveedor dao =new DaoEquipoProveedorImpl();
        dao.Modificar(eqp);
        System.out.println("EquipoProveedor modificado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("EquipoProveedor no modificado");

        }
        
        */
        //__________________Prueba eliminar EquipoProveedor_____________________
        
        /*
        EquipoProveedor eqp= new EquipoProveedor(3, 3);
                
        
        try{
        DaoEquipoProveedor dao =new DaoEquipoProveedorImpl();
        dao.Eliminar(eqp);
        System.out.println("EquipoProveedor eliminado con exito ");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("EquipoProveedor no eliminado");

        }
         
         */
        //__________________prueba listar EquipoProveedor_____________________
        /*
        try{
        DaoEquipoProveedor dao =new DaoEquipoProveedorImpl();
        System.out.println("id_Equipo   id_Proveedor");
        for (EquipoProveedor eqp : dao.Listar()){
            System.out.println("   "+eqp.getId_equipo()+"     "+eqp.getId_provedor());
        }
        
        System.out.println("____EquipoProveedor Listados con exito_____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("EquipoProveedor no listados");

        }

       
        */
        //_________________prueba Buscar Equipos por Id_Proveedor_____________________
        
        /*
       try{
        DaoEquipoProveedor dao =new DaoEquipoProveedorImpl();
        System.out.println("id_Equipo   id_Proveedor");
        int idBus=2;
        for (EquipoProveedor eqp : dao.BusEquiposXIdProveedor(idBus)){
            System.out.println("   "+eqp.getId_equipo()+"     "+eqp.getId_provedor());
        }
        
        System.out.println("____Equipos Listados con exito del proveedor "+idBus+" _____");

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("EquipoProveedor no listados");

        }
        
        
        */
        
        
    }

}

package datos;

import dominio.Departamento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDaoJDBC {

    private static String INSERTAR = "INSERT INTO tienda.departamento (nombre) VALUES (?)";
    private static String LISTAR = "SELECT * FROM tienda.departamento";
    private static String BUSCAR = "SELECT * FROM tienda.departamento WHERE id_departamento = ? ";
    private static String ELIMINAR = "DELETE FROM tienda.departamento WHERE id_departamento = ?";
    private static String ACTUALIZAR = "UPDATE tienda.departamento SET nombre= ? WHERE id_departamento = ?";

    public List<Departamento> listar() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Departamento departamento = null;
        List<Departamento> departamentos = new ArrayList<Departamento>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(LISTAR);
            rs = stmt.executeQuery();

            while (rs.next()) {

                String nombre = rs.getString("nombre");

                System.out.println(nombre);

                departamentos.add(new Departamento(nombre));

            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.Close(rs);
            Conexion.Close(stmt);
            Conexion.Close(conn);
        }

        return departamentos;
    }

    public int insertar(Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(INSERTAR);

            stmt.setString(1, departamento.getNombre());

            rows = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.Close(stmt);
            Conexion.Close(conn);
        }

        return rows;

    }

    public Departamento buscar(Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(BUSCAR);
            stmt.setInt(1,departamento.getId_departamento());
            rs = stmt.executeQuery();

                rs.next();
                String nombre = rs.getString("nombre");

                departamento.setNombre(nombre);

        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.Close(rs);
            Conexion.Close(stmt);
            Conexion.Close(conn);
        }

        return departamento;
    }
    
    public int actualizar(Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
      
        try {
            conn= Conexion.getConnection();
            stmt = conn.prepareStatement(ACTUALIZAR);
            stmt.setString(1,departamento.getNombre());
            stmt.setInt(2,departamento.getId_departamento());
            

            rows = stmt.executeUpdate();
              
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.Close(stmt);
            Conexion.Close(conn);
        }
        
        return rows;
    }
    
    public int eliminar (Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
      
        try {
            conn= Conexion.getConnection();
            stmt = conn.prepareStatement(ELIMINAR);
            stmt.setInt(1,departamento.getId_departamento());

            rows = stmt.executeUpdate();
                  
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.Close(stmt);
            Conexion.Close(conn);
        }
        
        return rows;
    }

    public static void main(String[] args) {

        //Pruebas CONEXION
        // PRUEBA LISTAR DEPARTAMENTOS
        System.out.println("***************LISTANDO DEPARTAMENTO**********************");
        DepartamentoDaoJDBC depto = new DepartamentoDaoJDBC();
        depto.listar();
        System.out.println("**************************************");

        //PRUEBA INSERTAR
        System.out.println("******************INSERTANDO DEPARTAMENTO**************");
        Departamento d = new Departamento("Departamento de prueba2");
        depto.insertar(d);
        depto.listar();
        System.out.println("Deparatamento insertado " + d);
        System.out.println("*********************************************************");

        //PRUEBA BUSCAR DEPTO
        System.out.println("**********************BUSCANDO DEPARTAMENTO*****************");
        Departamento d1 = new Departamento(1);
        System.out.println(depto.buscar(d1));
        System.out.println("***************************************************************");
  
        //PRUEBA ACTUALIZAR DEPTO
        System.out.println("**********************ACTUALIZANDO DEPARTAMENTO****************");
        Departamento d2 = new Departamento(5,"Departamento actualizado");
        depto.actualizar(d2);
        depto.listar();
        System.out.println("******************************************************************");
        
         //PRUEBA ELIMINAR
         System.out.println("********************ELIMINANDO DEPARTAMENTO*********************");
         depto.eliminar(d2);
         depto.listar();
         System.out.println("****************************************************************");
    }
}

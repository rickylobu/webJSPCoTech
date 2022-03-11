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
    private static String SELECT = "SELECT * FROM tienda.departamento";

    public List<Departamento> listar() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Departamento departamento = null;
        List<Departamento> departamentos = new ArrayList<Departamento>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SELECT);
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
    
    public static void main(String[] args) {
        
        
        //Prueba cponexion
        DepartamentoDaoJDBC depto = new DepartamentoDaoJDBC();
        
        depto.listar();
        
    }
}

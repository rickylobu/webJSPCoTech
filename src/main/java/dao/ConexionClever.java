
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ricardo
 */
public class ConexionClever {
    protected Connection conexion;
    
    private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    
    private final String BD_URL="jdbc:mysql://unw5imsdjyqtbfk0:SPGo9TsaUM83vI0o0LHX@balvzxuhrcxbnsiwxta3-mysql.services.clever-cloud.com:3306/balvzxuhrcxbnsiwxta3";


    Statement st =null;
    ResultSet rs=null;
   
    public void Conectar() throws Exception{
       try {
            conexion=DriverManager.getConnection(BD_URL);
            Class.forName (JDBC_DRIVER);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
    
    public void Cerrar() throws SQLException{
        if (conexion !=null){
            if (!conexion.isClosed()){
                conexion.close();
            }
        }
    }
       /*public static void main(String[] args) throws SQLException {
           
          // st=cn.createStatement();
            //st.executeUpdate("INSERT INTO `departamento`(`id_departamento`, `nombre`) VALUES (0,'pruebaNetbeansCon2');");
    }*/
        

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Departamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoDepartamentoImpl extends ConexionClever implements DaoDepartamento {

    @Override
    public void Registrar(Departamento depto) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `departamento`(`id_departamento`, `nombre`) VALUES ((?),(?));");
            //INSERT INTO `usuarios`(`id_usuario`, `email`, `nombre_usuario`, `contraseña`) VALUES (0,"ejemplo1@mail.com","UsrSqlConsol","1234"); 
            st.setInt(1, 0);
            st.setString(2, depto.getNombre());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Departamento depto) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `departamento` SET `nombre`= ? WHERE `id_departamento`= ?;");
            //UPDATE `usuarios` SET `email`="correo@ejemploDao",`nombre_usuario`="Chingonsio",`contraseña`="1234" WHERE `id_usuario`=4         
            st.setString(1, depto.getNombre());
            st.setInt(2, depto.getId_departamento());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Departamento depto) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `departamento` WHERE `id_departamento`=(?);");
            //DELETE FROM `usuarios` WHERE `id_usuario`=4             
            st.setInt(1, depto.getId_departamento());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Departamento> Listar() throws Exception {
        List<Departamento> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `departamento`;");
            //SELECT * FROM `usuarios`;            

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                Departamento usr = new Departamento(rs.getInt(1),rs.getString(2));
                
                lista.add(usr);

            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

        return lista;

    }

    @Override
    public Departamento BusDeptoXId(int i) throws Exception {
        Departamento depto=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `departamento` WHERE `id_departamento`=(?);");
            //SELECT * FROM `usuarios` WHERE `id_usuario`= 4;            
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
                depto = new Departamento(rs.getInt(1),rs.getString(2));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return depto;
    }
}

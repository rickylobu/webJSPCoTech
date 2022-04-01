/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoUsuarioImpl extends ConexionClever implements DaoUsuario {

    @Override
    public void Registrar(Usuario usr) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `usuarios`(`id_usuario`, `email`, `nombre_usuario`, `contraseña`) VALUES ((?),(?),(?),(?));");
            //INSERT INTO `usuarios`(`id_usuario`, `email`, `nombre_usuario`, `contraseña`) VALUES (0,"ejemplo1@mail.com","UsrSqlConsol","1234"); 
            st.setInt(1, 0);
            st.setString(2, usr.getEmail());
            st.setString(3, usr.getNombre_usuario());
            st.setString(4, usr.getContraseña());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Usuario usr) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `usuarios` SET `email`= ?,`nombre_usuario`= ?,`contraseña`= ? WHERE `id_usuario`= ?;");
            //UPDATE `usuarios` SET `email`="correo@ejemploDao",`nombre_usuario`="Chingonsio",`contraseña`="1234" WHERE `id_usuario`=4         
            st.setString(1, usr.getEmail());
            st.setString(2, usr.getNombre_usuario());
            st.setString(3, usr.getContraseña());
            st.setInt(4, usr.getId_usuario());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Usuario usr) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `usuarios` WHERE `id_usuario`=(?);");
            //DELETE FROM `usuarios` WHERE `id_usuario`=4             
            st.setInt(1, usr.getId_usuario());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Usuario> Listar() throws Exception {
        List<Usuario> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `usuarios`;");
            //SELECT * FROM `usuarios`;            

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                Usuario usr = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                
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
    public Usuario BusUsrXId(int i) throws Exception {
        Usuario usr=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `usuarios` WHERE `id_usuario`=(?);");
            //SELECT * FROM `usuarios` WHERE `id_usuario`= 4;            
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
                usr = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return usr;
    }
}

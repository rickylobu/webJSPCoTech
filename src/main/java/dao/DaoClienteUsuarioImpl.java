/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.ClienteUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoClienteUsuarioImpl extends ConexionClever implements DaoClienteUsuario {

    @Override
    public void Registrar(ClienteUsuario cu) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `cliente_usuario`(`id_cliente`, `id_usuario`) VALUES ((?),(?));");
            st.setInt(1, cu.getId_cliente());
            st.setInt(2, cu.getId_usuario());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(ClienteUsuario cu) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `cliente_usuario` SET `id_cliente`= ? WHERE `id_usuario`= ?;");
            st.setInt(1, cu.getId_cliente());
            st.setInt(2, cu.getId_usuario());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(ClienteUsuario cu) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `cliente_usuario` WHERE `id_usuario`=(?);");
            st.setInt(1, cu.getId_usuario());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<ClienteUsuario> Listar() throws Exception {
        List<ClienteUsuario> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `cliente_usuario`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                ClienteUsuario cu = new ClienteUsuario(rs.getInt(1),rs.getInt(2));
                
                lista.add(cu);

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
    public ClienteUsuario BusClienteXIdUsuario(int i) throws Exception {
        ClienteUsuario cu=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `cliente_usuario` WHERE `id_usuario`=(?);");
            //SELECT * FROM `usuarios` WHERE `id_usuario`= 4;            
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
               cu = new ClienteUsuario(rs.getInt(1),rs.getInt(2));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return cu;
    }
}

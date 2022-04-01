/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoClienteImpl extends ConexionClever implements DaoCliente {

    @Override
    public void Registrar(Cliente cl) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `clientes`(`id_cliente`, `nombre`, `calle`, `colonia`, `cp`, `numero`, `estado`, `telefono`, `email`) VALUES ((?),(?),(?),(?),(?),(?),(?),(?),(?));");
            st.setInt(1, 0);
            st.setString(2, cl.getNombre());
            st.setString(3, cl.getCalle());
            st.setString(4, cl.getColonia());
            st.setString(5, cl.getCp());
            st.setString(6, cl.getNumero());
            st.setString(7, cl.getEstado());
            st.setString(8, cl.getTelefono());
            st.setString(9, cl.getEmail());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Cliente cl) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `clientes` SET `nombre`= ?,`calle`= ?,`colonia`= ?,`cp`= ?,`numero`= ?,`estado`= ?,`telefono`= ?,`email`= ? WHERE `id_cliente`= ?;");
            st.setString(1, cl.getNombre());
            st.setString(2, cl.getCalle());
            st.setString(3, cl.getColonia());
            st.setString(4, cl.getCp());
            st.setString(5, cl.getNumero());
            st.setString(6, cl.getEstado());
            st.setString(7, cl.getTelefono());
            st.setString(8, cl.getEmail());
            st.setInt(9, cl.getId_cliente());

            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Cliente cl) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `clientes` WHERE `id_cliente`=(?);");
            st.setInt(1, cl.getId_cliente());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Cliente> Listar() throws Exception {
        List<Cliente> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `clientes`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                Cliente cl = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                
                lista.add(cl);

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
    public Cliente BusClienteXId(int i) throws Exception {
        Cliente cl=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `clientes` WHERE `id_cliente`=(?);");
            //SELECT * FROM `usuarios` WHERE `id_usuario`= 4;            
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
                cl = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return cl;
    }
}

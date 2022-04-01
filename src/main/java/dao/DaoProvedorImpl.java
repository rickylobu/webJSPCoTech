/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Provedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoProvedorImpl extends ConexionClever implements DaoProvedor {

    @Override
    public void Registrar(Provedor pr) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `proveedor`(`id_proveedor`, `nombre`, `calle`, `colonia`, `cp`, `numero`, `estado`, `telefono`) VALUES ((?),(?),(?),(?),(?),(?),(?),(?));");
            st.setInt(1, 0);
            st.setString(2, pr.getNombre());
            st.setString(3, pr.getCalle());
            st.setString(4, pr.getColonia());
            st.setString(5, pr.getCp());
            st.setString(6, pr.getNumero());
            st.setString(7, pr.getEstado());
            st.setInt(8, pr.getTelefono());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Provedor pr) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `proveedor` SET `nombre`= ?,`calle`= ?,`colonia`= ?,`cp`= ?,`numero`= ?,`estado`= ?,`telefono`= ? WHERE `id_proveedor`= ?;");
            st.setString(1, pr.getNombre());
            st.setString(2, pr.getCalle());
            st.setString(3, pr.getColonia());
            st.setString(4, pr.getCp());
            st.setString(5, pr.getNumero());
            st.setString(6, pr.getEstado());
            st.setInt(7, pr.getTelefono());
            st.setInt(8, pr.getId_provedor());

            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Provedor pr) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `proveedor` WHERE `id_proveedor`=(?);");
            st.setInt(1, pr.getId_provedor());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Provedor> Listar() throws Exception {
        List<Provedor> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `proveedor`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                Provedor pr = new Provedor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                
                lista.add(pr);

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
    public Provedor BusProvedorXId(int i) throws Exception {
        Provedor pr=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `proveedor` WHERE `id_proveedor`=(?);");
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
                pr = new Provedor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return pr;
    }
}

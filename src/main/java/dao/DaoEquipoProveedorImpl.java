/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.EquipoProveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoEquipoProveedorImpl extends ConexionClever implements DaoEquipoProveedor {

    @Override
    public void Registrar(EquipoProveedor eqp) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `equipos_proveedor`(`id_equipo`, `id_proveedor`) VALUES ((?),(?));");
            st.setInt(1, eqp.getId_equipo());
            st.setInt(2, eqp.getId_provedor());
            

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(EquipoProveedor eqp) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `equipos_proveedor` SET `id_proveedor`= ? WHERE `id_equipo`= ?;");
            
            st.setInt(1, eqp.getId_provedor());
            st.setInt(2, eqp.getId_equipo());
            

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(EquipoProveedor eqp) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `equipos_proveedor` WHERE `id_equipo`=(?);");
            st.setInt(1, eqp.getId_equipo());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<EquipoProveedor> Listar() throws Exception {
        List<EquipoProveedor> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `equipos_proveedor`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                EquipoProveedor eqp = new EquipoProveedor(rs.getInt(1),rs.getInt(2));
                
                lista.add(eqp);

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
    public List<EquipoProveedor> BusEquiposXIdProveedor(int i) throws Exception {
        List<EquipoProveedor> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `equipos_proveedor` WHERE `id_proveedor`=(?);");
            st.setInt(1, i);

            
            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                EquipoProveedor eqp = new EquipoProveedor(rs.getInt(1),rs.getInt(2));
                
                lista.add(eqp);

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
    
    
    
}

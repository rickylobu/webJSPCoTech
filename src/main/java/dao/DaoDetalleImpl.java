/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Detalle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoDetalleImpl extends ConexionClever implements DaoDetalle {

    @Override
    public void Registrar(Detalle det) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `detalle`(`id_compra`, `id_equipo`, `cantidad`, `precio`, `total`) VALUES ((?),(?),(?),(?),(?));");
            st.setInt(1, det.getId_compra());
            st.setInt(2, det.getId_equipo());
            st.setInt(3, det.getCantidad());
            st.setDouble(4, det.getPrecio());
            st.setDouble(5, det.getTotal());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Detalle det) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `detalle` SET `id_equipo`= ?,`cantidad`= ?,`precio`= ?,`total`= ? WHERE `id_compra`= ?;");
            st.setInt(1, det.getId_equipo());
            st.setInt(2, det.getCantidad());
            st.setDouble(3, det.getPrecio());
            st.setDouble(4, det.getTotal());
            st.setInt(5, det.getId_compra());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Detalle det) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `detalle` WHERE `id_compra`=(?);");
            st.setInt(1, det.getId_compra());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Detalle> Listar() throws Exception {
        List<Detalle> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `detalle`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                
                Detalle det = new Detalle(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getDouble(4),rs.getDouble(5));
                
                lista.add(det);

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
    public List<Detalle> BusDetalleXId(int i) throws Exception {
        List<Detalle> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `detalle` WHERE `id_compra`=(?);");
            st.setInt(1, i);


            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                
                Detalle det = new Detalle(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getDouble(4),rs.getDouble(5));
                
                lista.add(det);

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

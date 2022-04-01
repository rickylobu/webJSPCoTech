/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Compra;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoCompraImpl extends ConexionClever implements DaoCompra {

    @Override
    public void Registrar(Compra co) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `compras`(`id_usuario`, `total`, `fecha`) VALUES ((?),(?),(?));");
            st.setInt(1, co.getId_usuario());
            st.setDouble(2, co.getTotal());
            
            java.util.Date date=co.getFecha();
            long timeInMilliSeconds = date.getTime();
            java.sql.Date datesql = new java.sql.Date(timeInMilliSeconds);
            st.setDate(3, datesql);
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Compra co) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `compras` SET `id_usuario`= ?,`total`= ? WHERE `id_compra`= ?;");
            st.setInt(1, co.getId_usuario());
            st.setDouble(2, co.getTotal());
            st.setInt(3, co.getId_compra());

            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Compra co) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `compras` WHERE `id_compra`=(?);");
            st.setInt(1, co.getId_compra());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Compra> Listar() throws Exception {
        List<Compra> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `compras`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                Compra co = new Compra(rs.getInt(1),rs.getInt(2),rs.getDouble(3),(Date)rs.getDate(4));
                
                lista.add(co);

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
    public Compra BusCompraXId(int i) throws Exception {
        Compra co=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `compras` WHERE `id_compra`=(?);");
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
                co = new Compra(rs.getInt(1),rs.getInt(2),rs.getDouble(3),(Date)rs.getDate(4));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return co;
    }
}

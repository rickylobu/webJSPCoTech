/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dominio.Equipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class DaoEquipoImpl extends ConexionClever implements DaoEquipo {

    @Override
    public void Registrar(Equipo eq) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO `equipos`(`id_equipo`, `id_departamento`, `nombre`, `procesador`, `sistema_operativo`, `memoria`, `pantalla`, `ram`, `precio`, `imagen`) VALUES ((?),(?),(?),(?),(?),(?),(?),(?),(?),(?));");
            st.setInt(1, 0);
            st.setInt(2, eq.getId_departamento());
            st.setString(3, eq.getNombre());
            st.setString(4, eq.getProcesador());
            st.setString(5, eq.getSistema_operativo());
            st.setString(6, eq.getMemoria());
            st.setString(7, eq.getPantalla());
            st.setString(8, eq.getRam());
            st.setDouble(9, eq.getPrecio());
            st.setString(10, eq.getImagen());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Modificar(Equipo eq) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE `equipos` SET `id_departamento`= ?,`nombre`= ?,`procesador`= ?,`sistema_operativo`= ?,`memoria`= ?,`pantalla`= ?,`ram`= ?,`precio`= ?,`imagen`= ? WHERE `id_equipo`= ?;");
            
            st.setInt(1, eq.getId_departamento());
            st.setString(2, eq.getNombre());
            st.setString(3, eq.getProcesador());
            st.setString(4, eq.getSistema_operativo());
            st.setString(5, eq.getMemoria());
            st.setString(6, eq.getPantalla());
            st.setString(7, eq.getRam());
            st.setDouble(8, eq.getPrecio());
            st.setString(9, eq.getImagen());
            st.setInt(10, eq.getId_equipo());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public void Eliminar(Equipo eq) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM `equipos` WHERE `id_equipo`=(?);");
            st.setInt(1, eq.getId_equipo());

            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Equipo> Listar() throws Exception {
        List<Equipo> lista = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `equipos`;");

            lista = new ArrayList();
            rs = st.executeQuery();

            while (rs.next()) {
                Equipo eq = new Equipo(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getDouble(9),rs.getString(10));
                
                lista.add(eq);

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
    public Equipo BusEquipoXId(int i) throws Exception {
        Equipo eq=null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM `equipos` WHERE `id_equipo`=(?);");
            //SELECT * FROM `usuarios` WHERE `id_usuario`= 4;            
            st.setInt(1, i);
            rs = st.executeQuery();

            while (rs.next()) {
                eq = new Equipo(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getDouble(9),rs.getString(10));
                
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        
        return eq;
    }
}

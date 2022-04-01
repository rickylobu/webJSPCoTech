
package dao;

import dominio.Equipo;
import java.util.List;


public interface DaoEquipo {
    
    public void Registrar (Equipo eq)throws Exception;
    public void Modificar (Equipo eq)throws Exception;
    public void Eliminar (Equipo eq)throws Exception;
    public List<Equipo> Listar()throws Exception;
    public Equipo BusEquipoXId(int id)throws Exception;;
    
}

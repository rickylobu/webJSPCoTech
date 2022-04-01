
package dao;

import dominio.Detalle;
import java.util.List;


public interface DaoDetalle {
    
    public void Registrar (Detalle det)throws Exception;
    public void Modificar (Detalle det)throws Exception;
    public void Eliminar (Detalle det)throws Exception;
    public List<Detalle> Listar()throws Exception;
    public List<Detalle> BusDetalleXId(int id)throws Exception;;
    
}

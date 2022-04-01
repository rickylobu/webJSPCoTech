
package dao;

import dominio.EquipoProveedor;
import java.util.List;


public interface DaoEquipoProveedor {
    
    public void Registrar (EquipoProveedor eqp)throws Exception;
    public void Modificar (EquipoProveedor eqp)throws Exception;
    public void Eliminar (EquipoProveedor eqp)throws Exception;
    public List<EquipoProveedor> Listar()throws Exception;
    public List<EquipoProveedor> BusEquiposXIdProveedor(int id)throws Exception;;
    
}

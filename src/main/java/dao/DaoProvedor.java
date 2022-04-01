
package dao;

import dominio.Provedor;
import java.util.List;


public interface DaoProvedor {
    
    public void Registrar (Provedor pr)throws Exception;
    public void Modificar (Provedor pr)throws Exception;
    public void Eliminar (Provedor pr)throws Exception;
    public List<Provedor> Listar()throws Exception;
    public Provedor BusProvedorXId(int id)throws Exception;;
    
}

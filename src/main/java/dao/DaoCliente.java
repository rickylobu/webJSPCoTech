
package dao;

import dominio.Cliente;
import java.util.List;


public interface DaoCliente {
    
    public void Registrar (Cliente cl)throws Exception;
    public void Modificar (Cliente cl)throws Exception;
    public void Eliminar (Cliente cl)throws Exception;
    public List<Cliente> Listar()throws Exception;
    public Cliente BusClienteXId(int id)throws Exception;;
    
}

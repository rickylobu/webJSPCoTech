
package dao;

import dominio.ClienteUsuario;
import java.util.List;


public interface DaoClienteUsuario {
    
    public void Registrar (ClienteUsuario cu)throws Exception;
    public void Modificar (ClienteUsuario cu)throws Exception;
    public void Eliminar (ClienteUsuario cu)throws Exception;
    public List<ClienteUsuario> Listar()throws Exception;
    public ClienteUsuario BusClienteXIdUsuario(int id)throws Exception;;
    
    
}


package dao;

import dominio.Usuario;
import java.util.List;


public interface DaoUsuario {
    
    public void Registrar (Usuario usr)throws Exception;
    public void Modificar (Usuario usr)throws Exception;
    public void Eliminar (Usuario usr)throws Exception;
    public List<Usuario> Listar()throws Exception;
    public Usuario BusUsrXId(int id)throws Exception;;
    
}

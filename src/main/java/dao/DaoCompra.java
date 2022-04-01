
package dao;

import dominio.Compra;
import java.util.List;


public interface DaoCompra {
    
    public void Registrar (Compra co)throws Exception;
    public void Modificar (Compra co)throws Exception;
    public void Eliminar (Compra co)throws Exception;
    public List<Compra> Listar()throws Exception;
    public Compra BusCompraXId(int id)throws Exception;;
    
}

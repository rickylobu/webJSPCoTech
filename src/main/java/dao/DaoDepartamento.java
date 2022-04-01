
package dao;

import dominio.Departamento;
import java.util.List;


public interface DaoDepartamento {
    
    public void Registrar (Departamento depto)throws Exception;
    public void Modificar (Departamento depto)throws Exception;
    public void Eliminar (Departamento depto)throws Exception;
    public List<Departamento> Listar()throws Exception;
    public Departamento BusDeptoXId(int id)throws Exception;;
    
}

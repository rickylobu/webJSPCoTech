/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Ricardo
 */
public class EquipoProveedor {
    
    private int id_equipo;
    private int id_provedor;

    public EquipoProveedor(int id_equipo, int id_provedor) {
        this.id_equipo = id_equipo;
        this.id_provedor = id_provedor;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }
    
    
    
    
    
}

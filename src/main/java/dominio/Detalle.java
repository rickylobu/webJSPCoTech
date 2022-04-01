
package dominio;


public class Detalle {
    int id_compra;
    int id_equipo;
    int cantidad;
    double precio;
    double total;

    public Detalle() {
    }

    public Detalle(int id_compra, int id_equipo, int cantidad, double precio, double total) {
        this.id_compra = id_compra;
        this.id_equipo = id_equipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
    
}

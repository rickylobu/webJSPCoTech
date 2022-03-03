/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotech;

import java.util.*;

/**
 *
 * @author Ricardo
 */
public class Compra {
    private int id_compra;
    private String mombre_producto;
    private int cantidad;
    private double total;
    private Date fecha;

    public Compra(int id_compra, String mombre_producto, int cantidad, double total, Date fecha) {
        this.id_compra = id_compra;
        this.mombre_producto = mombre_producto;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getMombre_producto() {
        return mombre_producto;
    }

    public void setMombre_producto(String mombre_producto) {
        this.mombre_producto = mombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
}

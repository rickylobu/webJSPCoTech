/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Ricardo
 */
public class Departamento {
    
    private int id_departamento;
    private String nombre;

    //Constructor

    public Departamento(int id_departamento, String nombre) {
        this.id_departamento = id_departamento;
        this.nombre = nombre;
    }

    public Departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    //Setters y getters
    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    @Override
    public String toString() {
        return "Departamento{" + "id_departamento=" + id_departamento + ", nombre_depa=" + nombre + '}';
    }
    
    
    
}

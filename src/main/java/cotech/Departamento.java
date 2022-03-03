/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotech;

/**
 *
 * @author Ricardo
 */
public class Departamento {
    
    private int id_departamento;
    private String nombre_depa;

    public Departamento(int id_departamento, String nombre_depa) {
        this.id_departamento = id_departamento;
        this.nombre_depa = nombre_depa;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre_depa() {
        return nombre_depa;
    }

    public void setNombre_depa(String nombre_depa) {
        this.nombre_depa = nombre_depa;
    }
    
    
}

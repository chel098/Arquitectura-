package com.example.ucb.arquitectura.model;

import javax.persistence.*;

@Entity
@Table(name = "Proveedor",schema = "inventario2", catalog = "")
public class Proveedor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CPR")
    private int CPR;
    @Basic
    @Column(name = "Nombre")
    private String Nombre;
    @Basic
    @Column(name = "Descripcion")
    private String Descripcion;

    public Proveedor(int CPR, String nombre, String descripcion) {
        this.CPR = CPR;
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public Proveedor() {

    }

    public int getCPR() {
        return CPR;
    }

    public void setCPR(int CPR) {
        this.CPR = CPR;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}

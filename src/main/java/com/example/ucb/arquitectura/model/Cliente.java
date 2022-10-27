package com.example.ucb.arquitectura.model;

import javax.persistence.*;

@Entity
@Table(name = "Cliente",schema = "inventario2", catalog = "")

public class Cliente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CC")
    private int CC;
    @Basic
    @Column(name = "Nombre")
    private String Nombre;
    @Basic
    @Column(name = "NIT")
    private String NIT;

    public Cliente(int CC, String nombre, String NIT) {
        this.CC = CC;
        Nombre = nombre;
        this.NIT = NIT;
    }

    public Cliente() {

    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}

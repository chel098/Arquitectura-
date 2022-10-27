package com.example.ucb.arquitectura.model;

import javax.persistence.*;

@Entity
@Table (name = "Administrador", schema = "inventario2",catalog = "")
public class Administrador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CA")
    private int CA;
    @Basic
    @Column(name = "CI")
    private String CI;
    @Basic
    @Column(name = "Nombre")
    private String Nombre;
    @Basic
    @Column(name = "Usuario")
    private String Usuario;
    @Basic
    @Column(name = "Password")
    private String Password;

    public Administrador(int CA, String CI, String nombre, String usuario, String password) {
        this.CA = CA;
        CI = CI;
        Nombre = nombre;
        Usuario = usuario;
        Password = password;
    }

    public Administrador() {

    }

    public int getCA() {
        return CA;
    }

    public void setCA(int CA) {
        this.CA = CA;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
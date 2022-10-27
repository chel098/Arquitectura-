package com.example.ucb.arquitectura.dto;

public class ProvRequest {
    private Integer CPR;
    private String Nombre;
    private String Descripcion;

    public ProvRequest(Integer CPR, String nombre, String descripcion) {
        this.CPR = CPR;
        Nombre = nombre;
        Descripcion = descripcion;
    }

    public Integer getCPR() {
        return CPR;
    }

    public void setCPR(Integer CPR) {
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

    @Override
    public String toString() {
        return "ProvRequest{" +
                "CPR=" + CPR +
                ", Nombre='" + Nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}

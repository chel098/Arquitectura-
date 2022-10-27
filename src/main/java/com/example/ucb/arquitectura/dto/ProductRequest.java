package com.example.ucb.arquitectura.dto;

import java.util.Date;

public class ProductRequest {
    private String Nombre;
    private Integer Stock;

    public ProductRequest(String nombre, Integer stock) {
        Nombre = nombre;
        Stock = stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

}



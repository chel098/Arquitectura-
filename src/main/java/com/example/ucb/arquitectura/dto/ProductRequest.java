package com.example.ucb.arquitectura.dto;

import java.util.Date;

public class ProductRequest {
    private String Nombre;
    private String Descripcion;
    private Integer Stock;
    private Double Precio_compra;
    private Double Precio_venta;
    private Date Fecha_vencimiento;

    public ProductRequest(String nombre, String descripcion, Integer stock, Double precio_compra, Double precio_venta, Date fecha_vencimiento) {
        Nombre = nombre;
        Descripcion = descripcion;
        Stock = stock;
        Precio_compra = precio_compra;
        Precio_venta = precio_venta;
        Fecha_vencimiento = fecha_vencimiento;
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

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public Double getPrecio_compra() {
        return Precio_compra;
    }

    public void setPrecio_compra(Double precio_compra) {
        Precio_compra = precio_compra;
    }

    public Double getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(Double precio_venta) {
        Precio_venta = precio_venta;
    }

    public Date getFecha_vencimiento() {
        return Fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        Fecha_vencimiento = fecha_vencimiento;
    }
}



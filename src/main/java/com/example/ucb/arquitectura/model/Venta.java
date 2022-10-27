package com.example.ucb.arquitectura.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Venta",schema = "inventario2", catalog = "")
public class Venta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CV")
    private int CV;
    @Basic
    @Column(name = "Fecha")
    private Date Fecha;
    @Basic
    @Column(name = "Cantidad")
    private Integer Cantidad;
    @Basic
    @Column(name = "Precio_Total")
    private Double Precio_Total;
    @Basic
    @Column(name = "Producto_CPD")
    private Integer Producto_CPD;
    @Basic
    @Column(name = "Cliente_CC")
    private Integer Cliente_CC;

    public Venta(int CPD, Date fecha, Integer cantidad, Double precio_Total, Integer producto_CPD, Integer cliente_CC) {
        this.CV = CV;
        Fecha = fecha;
        Cantidad = cantidad;
        Precio_Total = precio_Total;
        Producto_CPD = producto_CPD;
        Cliente_CC = cliente_CC;
    }

    public Venta() {

    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public Double getPrecio_Total() {
        return Precio_Total;
    }

    public void setPrecio_Total(Double precio_Total) {
        Precio_Total = precio_Total;
    }

    public Integer getProducto_CPD() {
        return Producto_CPD;
    }

    public void setProducto_CPD(Integer producto_CPD) {
        Producto_CPD = producto_CPD;
    }

    public Integer getCliente_CC() {
        return Cliente_CC;
    }

    public void setCliente_CC(Integer cliente_CC) {
        Cliente_CC = cliente_CC;
    }

}

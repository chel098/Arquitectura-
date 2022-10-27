package com.example.ucb.arquitectura.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Producto",schema = "inventario2", catalog = "")
public class Producto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CPD")
    private int CPD;
    @Basic
    @Column(name = "Nombre")
    private String Nombre;
    @Basic
    @Column(name = "Descripion")
    private String Descripion;
    @Basic
    @Column(name = "Stock")
    private Integer Stock;
    @Basic
    @Column(name = "Precio_compra")
    private Double Precio_compra;
    @Basic
    @Column(name = "Precio_venta")
    private Double Precio_venta;
    @Temporal(TemporalType.DATE)
    @Column(name = "Fecha_vencimiento")
    private Date Fecha_vencimiento;
    @Basic
    @Column(name = "Proveedor_CPR")
    private Integer Proveedor_CPR;

    public Producto(int CPD, String nombre, String descripcion, Integer stock, Double precio_compra, Double precio_venta, Date fecha_vencimiento, Integer proveedor_CPR) {
        this.CPD = CPD;
        Nombre = nombre;
        Descripion = descripcion;
        Stock = stock;
        Precio_compra = precio_compra;
        Precio_venta = precio_venta;
        Fecha_vencimiento = fecha_vencimiento;
        Proveedor_CPR = proveedor_CPR;
    }

    public Producto() {

    }

    public int getCPD() {
        return CPD;
    }

    public void setCPD(int CPD) {
        this.CPD = CPD;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripion;
    }

    public void setDescripcion(String descripcion) {
        Descripion = descripcion;
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

    public Integer getProveedor_CPR() {
        return Proveedor_CPR;
    }

    public void setProveedor_CPR(Integer proveedor_CPR) {
        Proveedor_CPR = proveedor_CPR;
    }
}

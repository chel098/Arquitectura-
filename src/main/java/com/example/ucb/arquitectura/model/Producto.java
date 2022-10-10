package com.example.ucb.arquitectura.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Producto",schema = "inventario", catalog = "")
public class Producto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CPD")
    private int CPD;
    @Basic
    @Column(name = "Nombre")
    private String Nombre;
    @Basic
    @Column(name = "Descripcion")
    private String Descripcion;
    @Basic
    @Column(name = "Stock")
    private Integer Stock;
    @Basic
    @Column(name = "Precio_compra")
    private Double Precio_compra;
    @Basic
    @Column(name = "Precio_venta")
    private Double Precio_venta;
    @Basic
    @Column(name = "Fecha_vencimiento")
    private Date Fecha_vencimiento;
    @Basic
    @Column(name = "Proveedor_CPR")
    private Integer Proveedor_CPR;

}

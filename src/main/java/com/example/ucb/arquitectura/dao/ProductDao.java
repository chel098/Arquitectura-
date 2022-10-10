package com.example.ucb.arquitectura.dao;

import com.example.ucb.arquitectura.dto.ProductRequest;
import com.example.ucb.arquitectura.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductDao extends JpaRepository<Producto, List<Integer>> {

    @Query(
        value ="SELECT new com.example.ucb.arquitectura.dto.ProductRequest(a.Nombre,a.Descripcion,a.Stock,a.Precio_compra,a.Precio_venta,a.Fecha_vencimiento)" +
                "FROM Producto a"
    )
    public List<ProductRequest>findProductoList();

}

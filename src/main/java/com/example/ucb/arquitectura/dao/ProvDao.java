package com.example.ucb.arquitectura.dao;

import com.example.ucb.arquitectura.dto.ProductRequest;
import com.example.ucb.arquitectura.dto.ProvRequest;
import com.example.ucb.arquitectura.model.Producto;
import com.example.ucb.arquitectura.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvDao extends JpaRepository<Proveedor, Integer> {
//    @Query(
//            value = "select NEW com.example.ucb.arquitectura.dto.ProvRequest(a.CPR,a.Nombre,a.Descripcion)" +
//                    "FROM Proveedor a"
//    )
//    public List<ProvRequest>findProveedorList();


}

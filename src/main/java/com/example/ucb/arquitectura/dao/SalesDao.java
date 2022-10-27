package com.example.ucb.arquitectura.dao;

import com.example.ucb.arquitectura.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesDao extends JpaRepository<Venta,Integer> {


}

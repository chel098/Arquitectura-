package com.example.ucb.arquitectura.dao;

import com.example.ucb.arquitectura.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Cliente, Integer> {


}

package com.example.ucb.arquitectura.dao;

import com.example.ucb.arquitectura.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<Administrador, Integer> {


}

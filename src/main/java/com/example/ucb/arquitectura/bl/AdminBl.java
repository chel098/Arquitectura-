package com.example.ucb.arquitectura.bl;

import com.example.ucb.arquitectura.dao.AdminDao;
import com.example.ucb.arquitectura.model.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminBl {
    @Autowired
    private AdminDao adminDao;

    public List<Administrador> getAdminList(){
        return adminDao.findAll();
    }
    public Administrador CrearAdministrador(Administrador administrador){
        return adminDao.save(administrador);

    }
    public void BorrarAdministrador(Integer CA){
        adminDao.deleteById(CA);
    }

    public Administrador CambiarAdministrador(Administrador administrador){
        return adminDao.save(administrador);

    }
    public Administrador BuscarAdministrador(Integer CA){
        return adminDao.findById(CA).get();
    }
}

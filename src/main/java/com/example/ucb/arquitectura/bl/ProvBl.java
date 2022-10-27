package com.example.ucb.arquitectura.bl;

import com.example.ucb.arquitectura.dao.ProvDao;
import com.example.ucb.arquitectura.dto.ProductRequest;
import com.example.ucb.arquitectura.dto.ProvRequest;
import com.example.ucb.arquitectura.model.Proveedor;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvBl {
    @Autowired
    private ProvDao provDao;
    public List<Proveedor> getProvList(){
        return provDao.findAll();

    }
    public Proveedor CrearProveedor (Proveedor proveedor){
        return provDao.save(proveedor);

    }
    public void BorrarProveedor (Integer CPR){
        provDao.deleteById(CPR);
    }
    public Proveedor CambiarProveedor(Proveedor proveedor){
        return provDao.save(proveedor);
    }
    public Proveedor BuscarProveedor(Integer CPR){

        return provDao.findById(CPR).get();


    }
}

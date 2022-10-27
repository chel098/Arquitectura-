package com.example.ucb.arquitectura.bl;

import com.example.ucb.arquitectura.dao.SalesDao;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesBl {
    @Autowired
    private SalesDao salesDao;
    public List<Venta> getVentasList(){
        return salesDao.findAll();
    }
    public Venta CrearVenta(Venta venta){
        return salesDao.save(venta);
    }
    public void BorrarVenta(Integer CV){
        salesDao.deleteById(CV);
    }
    public Venta BuscarVenta(Integer CV){

        return salesDao.findById(CV).get();


    }
    public Venta CambiarVenta(Venta venta){
        return salesDao.save(venta);
    }
}

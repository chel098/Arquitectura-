package com.example.ucb.arquitectura.bl;

import com.example.ucb.arquitectura.dao.ProductDao;
import com.example.ucb.arquitectura.dto.ProductRequest;
import com.example.ucb.arquitectura.model.Producto;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductBl {
    @Autowired
    private ProductDao productDao;

    public List<Producto> getProductList(){
        return productDao.findAll();

    }
    public Producto CrearProducto (Producto producto){
        return productDao.save(producto);
    }
    public void BorrarProducto (Integer CPD){
        productDao.deleteById(CPD);
    }

    public Producto CambiarProducto (Producto producto){
        return productDao.save(producto);
    }


    public Producto BuscarProducto(Integer CPD){

        return productDao.findById(CPD).get();


    }
    public List<ProductRequest> ProductoName(){
        return productDao.findProductoWithName();
    }

}

package com.example.ucb.arquitectura.bl;

import com.example.ucb.arquitectura.dao.ProductDao;
import com.example.ucb.arquitectura.dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductBl {
    @Autowired
    private ProductDao productDao;

    public List<ProductRequest> getProductList(){
        List<Integer>list =new ArrayList<>();
        return productDao.findProductoList();

    }
}

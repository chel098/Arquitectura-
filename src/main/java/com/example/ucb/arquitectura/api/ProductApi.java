package com.example.ucb.arquitectura.api;

import com.example.ucb.arquitectura.bl.ProductBl;
import com.example.ucb.arquitectura.dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ProductApi {
    private ProductBl productBl;
    @Autowired

    public ProductApi(ProductBl productBl) {
        this.productBl = productBl;
    }
    @RequestMapping(value = "/ProductList",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductRequest> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return productBl.getProductList();
    }
}

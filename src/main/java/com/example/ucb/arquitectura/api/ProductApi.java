package com.example.ucb.arquitectura.api;

import com.example.ucb.arquitectura.bl.ProductBl;
import com.example.ucb.arquitectura.dto.ProductRequest;
import com.example.ucb.arquitectura.model.Producto;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
    public List<Producto> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return productBl.getProductList();
    }
    @RequestMapping(value = "/AddProduct",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Producto CreateProduct(@RequestBody Producto producto) {
        System.out.println("Invocando al metodo GET :0");
        return productBl.CrearProducto(producto);
    }
    @RequestMapping(value = "/DeleteProduct/{CPD}",method= RequestMethod.DELETE)
    public String DeleteProduct(@PathVariable("CPD") Integer CPD) {
        try {
            productBl.BorrarProducto(CPD);
            return "Borrado correcto";
        }
        catch (Exception e){
            return ("Borrado no logrado ");
        }
    }
    @RequestMapping(value = "/ChangeProduct",method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Producto ChangeProduct(@RequestBody Producto producto) {
        System.out.println("Invocando al metodo GET :0");
        return productBl.CambiarProducto(producto);
    }
    @RequestMapping(value = "/ProductName",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductRequest> ProductoNombre() {
        System.out.println("Invocando al metodo GET :0");
        return productBl.ProductoName();
    }
    @RequestMapping(value = "/FindProduct/{CPD}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Producto ChangeSale(@PathVariable("CPD") Integer CPD) {

        return productBl.BuscarProducto(CPD);
    }
}

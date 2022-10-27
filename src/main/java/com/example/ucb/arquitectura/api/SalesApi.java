package com.example.ucb.arquitectura.api;

import com.example.ucb.arquitectura.bl.SalesBl;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/v1")

public class SalesApi {
    private SalesBl salesBl;
    @Autowired
    public SalesApi(SalesBl salesBl) {
        this.salesBl = salesBl;
    }
    @RequestMapping(value = "/SalesList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Venta> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return salesBl.getVentasList();
    }
    @RequestMapping(value = "/AddSale",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Venta CreateSale(@RequestBody Venta venta) {
        System.out.println("Invocando al metodo GET :0");
        return salesBl.CrearVenta(venta);
    }
    @RequestMapping(value = "/DeleteSale/{CV}",method= RequestMethod.DELETE)
    public String DeleteSale(@PathVariable("CV") Integer CV) {
        try {
            salesBl.BorrarVenta(CV);
            return "Borrado correcto";
        }
        catch (Exception e){
            return ("Borrado no logrado ");
        }
    }
    @RequestMapping(value = "/FindSale/{CV}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Venta ChangeSale(@PathVariable("CV") Integer CV) {

        return salesBl.BuscarVenta(CV);
    }

    @RequestMapping(value = "/ChangeSale",method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Venta ChangeSale(@RequestBody Venta venta) {
        System.out.println("Invocando al metodo GET :0");
        return salesBl.CambiarVenta(venta);
    }

}

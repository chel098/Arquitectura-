package com.example.ucb.arquitectura.api;

import com.example.ucb.arquitectura.bl.ProvBl;
import com.example.ucb.arquitectura.model.Producto;
import com.example.ucb.arquitectura.model.Proveedor;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1")

public class ProvApi {
    private ProvBl provBl;
    @Autowired
    public ProvApi(ProvBl provBl) {

        this.provBl = provBl;
    }
    @RequestMapping(value = "/ProvList",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Proveedor> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return provBl.getProvList();
    }

    @RequestMapping(value = "/AddProv",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Proveedor CreateProv(@RequestBody Proveedor proveedor) {
        System.out.println("Invocando al metodo GET :0");
        return provBl.CrearProveedor(proveedor);

    }
    @RequestMapping(value = "/DeleteProv/{CPR}",method= RequestMethod.DELETE)
    public String DeleteProv(@PathVariable("CPR") Integer CPR) {
        try {
            provBl.BorrarProveedor(CPR);
            return "Borrado correcto";
        }
        catch (Exception e){
            return ("Borrado no logrado ");
        }
    }
    @RequestMapping(value = "/ChangeProv",method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Proveedor ChangeProv(@RequestBody Proveedor proveedor) {
        System.out.println("Invocando al metodo GET :0");
        return provBl.CambiarProveedor(proveedor);

    }
    @RequestMapping(value = "/FindProv/{CPR}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Proveedor ChangeProv(@PathVariable("CPR") Integer CPR) {
        return provBl.BuscarProveedor(CPR);
    }
}

package com.example.ucb.arquitectura.api;

import com.example.ucb.arquitectura.bl.AdminBl;
import com.example.ucb.arquitectura.model.Administrador;
import com.example.ucb.arquitectura.model.Producto;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class AdminApi {
    private AdminBl adminBl;
    @Autowired
    public AdminApi(AdminBl adminBl) {
        this.adminBl = adminBl;
    }
    @RequestMapping(value = "/AdminList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Administrador> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return adminBl.getAdminList();
    }
    @RequestMapping(value = "/AddAdmin",method= RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Administrador CreateAdmin(@RequestBody Administrador administrador){
        System.out.println("Invocando al metodo POST :0");
        return adminBl.CrearAdministrador(administrador);
    }
    @RequestMapping(value = "/DeleteAdmin/{CA}",method= RequestMethod.DELETE)
    public String DeleteAdmin(@PathVariable("CA") Integer CA){
        try {
            adminBl.BorrarAdministrador(CA);
            return "Borrado correcto";
        }
        catch (Exception e){
            return ("Borrado no logrado ");
        }
    }
    @RequestMapping(value = "/ChangeAdmin",method= RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Administrador ChangeAdmin(@RequestBody Administrador administrador){
        System.out.println("Invocando al metodo POST :0");
        return adminBl.CambiarAdministrador(administrador);
    }

    @RequestMapping(value = "/FindAdmin/{CA}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Administrador ChangeAdmin(@PathVariable("CA") Integer CA) {

        return adminBl.BuscarAdministrador(CA);
    }
}

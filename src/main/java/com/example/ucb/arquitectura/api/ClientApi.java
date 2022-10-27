package com.example.ucb.arquitectura.api;

import com.example.ucb.arquitectura.bl.ClientBl;
import com.example.ucb.arquitectura.model.Cliente;
import com.example.ucb.arquitectura.model.Producto;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1")
public class ClientApi {
    private ClientBl clientBl;

    @Autowired
    public ClientApi(ClientBl clientBl) {
        this.clientBl = clientBl;
    }

    @RequestMapping(value = "/ClientList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cliente> listAll() {
        System.out.println("Invocando al metodo GET :0");
        return clientBl.getClienteList();
    }

    @RequestMapping(value = "/AddClient", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente CreateClient(@RequestBody Cliente cliente) {
        System.out.println("Invocando al metodo GET :0");
        return clientBl.CrearCliente(cliente);
    }

    @RequestMapping(value = "/DeleteClient/{CC}", method = RequestMethod.DELETE)
    public String DeleteClient(@PathVariable("CC") Integer CC) {
        try {
            clientBl.BorrarCliente(CC);
            return "Borrado correcto";
        } catch (Exception e) {
            return ("Borrado no logrado ");
        }
    }
    @RequestMapping(value = "/ChangeClient", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente ChangeClient(@RequestBody Cliente cliente) {
        System.out.println("Invocando al metodo GET :0");
        return clientBl.CambiarCliente(cliente);
    }
    @RequestMapping(value = "/FindClient/{CC}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Cliente ChangeClient(@PathVariable("CC") Integer CC) {

        return clientBl.BuscarCliente(CC);
    }
}

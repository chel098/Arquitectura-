package com.example.ucb.arquitectura.bl;

import com.example.ucb.arquitectura.dao.ClientDao;
import com.example.ucb.arquitectura.model.Cliente;
import com.example.ucb.arquitectura.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientBl {
    @Autowired
    private ClientDao clientDao;

    public List<Cliente> getClienteList(){
        return clientDao.findAll();
    }
    public Cliente CrearCliente(Cliente cliente){
        return clientDao.save(cliente);
    }
    public void BorrarCliente(Integer CC){
        clientDao.deleteById(CC);
    }
    public Cliente CambiarCliente(Cliente cliente){
        return clientDao.save(cliente);
    }
    public Cliente BuscarCliente(Integer CC){

        return clientDao.findById(CC).get();


    }
}

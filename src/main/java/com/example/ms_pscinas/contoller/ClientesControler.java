package com.example.ms_pscinas.contoller;

import com.example.ms_pscinas.entitys.Clientes;
import com.example.ms_pscinas.services.ClientesServices;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClientesControler {

    @Autowired
    private ClientesServices clientesServices;

    @GetMapping
    public List<Clientes> getClienteAll(){
        return clientesServices.getTodosClientes();
    }

    @GetMapping("/{id_cliente}")
    public Clientes getClienteById(@PathVariable Long id_cliente){
        return clientesServices.getClientePorID(id_cliente);
    }

    @PostMapping
    public Clientes postCliente(@RequestBody Clientes cliente){
        return clientesServices.postSalvarCliente(cliente);
    }

    @DeleteMapping("/{id_cliente}")
    public Clientes deleteCliente(@PathVariable Long id_cliente){
        return clientesServices.deleteCliente(id_cliente);
    }
}

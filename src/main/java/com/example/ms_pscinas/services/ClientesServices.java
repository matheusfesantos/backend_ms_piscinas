package com.example.ms_pscinas.services;

import com.example.ms_pscinas.entitys.Clientes;
import com.example.ms_pscinas.repository.ClientesRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServices {

    @Autowired
    private ClientesRepos clientesRepos;

    public List<Clientes> getTodosClientes(){
        return clientesRepos.findAll();
    }

    public Clientes getClientePorID(Long id){
        if (clientesRepos.existsById(id)){
            return clientesRepos.getById(id);
        }
        else{
            throw new RuntimeException("Cliente no encontrado");
        }
    }

    public Clientes postSalvarCliente(Clientes cliente){
        return clientesRepos.save(cliente);
    }
}

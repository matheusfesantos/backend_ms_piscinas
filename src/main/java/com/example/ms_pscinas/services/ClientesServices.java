package com.example.ms_pscinas.services;

import com.example.ms_pscinas.entitys.Clientes;
import com.example.ms_pscinas.repository.ClientesRepos;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClientesServices {

    @Autowired
    private ClientesRepos clientesRepos;

    @Transactional
    public List<Clientes> getTodosClientes(){
        return clientesRepos.findAll();
    }

    @Transactional
    public Clientes getClientePorID(Long id_cliente){
        if(!clientesRepos.existsById(id_cliente)){
            return null;
        }
        return clientesRepos.findById(id_cliente).get();
    }

    public Clientes postSalvarCliente(Clientes cliente){
        return clientesRepos.save(cliente);
    }

    public Clientes deleteCliente(Long id){
        if (clientesRepos.existsById(id)){
            clientesRepos.deleteById(id);
        }
        else{
            throw new RuntimeException("Cliente não encontrado");
        }
        return null;
    }
}

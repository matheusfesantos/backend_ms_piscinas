package com.example.ms_pscinas.repository;

import com.example.ms_pscinas.entitys.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepos extends JpaRepository<Clientes, Long> {
}

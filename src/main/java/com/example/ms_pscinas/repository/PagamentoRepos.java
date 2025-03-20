package com.example.ms_pscinas.repository;

import com.example.ms_pscinas.entitys.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepos extends JpaRepository<Pagamentos, Long>{
}

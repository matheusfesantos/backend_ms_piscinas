package com.example.ms_pscinas.entitys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    private String nome;

    private String localizacao;

    private Double mensalidade;

    private int quantidade_visitas;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("cliente")
    private List<Pagamentos> pagamentos;
}

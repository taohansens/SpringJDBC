package com.taohansen.springjdbc.entitie;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("FORNECEDORES")
public class Fornecedor {
    @Id
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
}

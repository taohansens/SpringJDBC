package com.taohansen.springjdbc.service;

import com.taohansen.springjdbc.entitie.Fornecedor;
import com.taohansen.springjdbc.repositorie.FornecedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    public Iterable<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> findById(Long id) {
        return fornecedorRepository.findById(id);
    }


    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }


    public Fornecedor update(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void delete(Long id) {
        fornecedorRepository.deleteById(id);
    }
}

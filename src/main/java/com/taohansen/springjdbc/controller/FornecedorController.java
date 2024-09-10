package com.taohansen.springjdbc.controller;

import com.taohansen.springjdbc.entitie.Fornecedor;
import com.taohansen.springjdbc.service.FornecedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
@RequiredArgsConstructor
public class FornecedorController {
    private final FornecedorService fornecedorService;

    @GetMapping
    public Iterable<Fornecedor> listarTodosFornecedores() {
        return fornecedorService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Fornecedor> obterFornecedorPorId(@PathVariable Long id) {
        return fornecedorService.findById(id);
    }

    @PostMapping
    public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.save(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor atualizarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        fornecedor.setId(id);
        return fornecedorService.update(fornecedor);
    }

    @DeleteMapping("/{id}")
    public void excluirFornecedor(@PathVariable Long id) {
        fornecedorService.delete(id);
    }
}

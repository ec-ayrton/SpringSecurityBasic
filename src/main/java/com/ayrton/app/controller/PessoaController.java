package com.ayrton.app.controller;


import com.ayrton.app.model.Pessoa;
import com.ayrton.app.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public List<Pessoa> listarDonos(){
        return pessoaService.buscarPessoas();
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa){
        return  pessoaService.cadastrarPessoa(pessoa);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void desativarDono(@PathVariable Long id){
        pessoaService.excluirPessoa(id);
    }
}

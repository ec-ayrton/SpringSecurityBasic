package com.ayrton.veiculosapi.service;

import com.ayrton.veiculosapi.model.Pessoa;

import java.util.List;


public interface PessoaService {

    List<Pessoa> buscarPessoas();

    Pessoa cadastrarPessoa(Pessoa pessoa);

    void excluirPessoa(Long id);
}

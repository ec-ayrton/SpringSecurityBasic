package com.ayrton.app.service;

import com.ayrton.app.model.Pessoa;

import java.util.List;


public interface PessoaService {

    List<Pessoa> buscarPessoas();

    Pessoa cadastrarPessoa(Pessoa pessoa);

    void excluirPessoa(Long id);
}

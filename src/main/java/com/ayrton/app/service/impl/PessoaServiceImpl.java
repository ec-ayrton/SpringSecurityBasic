package com.ayrton.app.service.impl;

import com.ayrton.app.model.Pessoa;
import com.ayrton.app.repository.PessoaRepository;
import com.ayrton.app.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarPessoas(){
        return pessoaRepository.findAll();
    }

    public Pessoa cadastrarPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public void excluirPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}

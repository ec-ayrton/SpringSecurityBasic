package com.ayrton.veiculosapi.service.impl;

import com.ayrton.veiculosapi.model.Pessoa;
import com.ayrton.veiculosapi.repository.PessoaRepository;
import com.ayrton.veiculosapi.service.PessoaService;
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

    @Override
    public void excluirPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }
}

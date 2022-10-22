package com.ayrton.veiculosapi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PESSOA")
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
}

package br.com.etec.cinehas.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_SALA") // @table é para quando a classe esta nomeada diferente da tabela no sql
public class Sala {
    @Id //Esse campo é a chave primária na tabela
    @Column(name = "ID_SALA")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // É quando o banco de dados gera o valor do campo automaticamente, sem o usuario inserir
    private Integer id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_PRECO")
    private double preco;
}

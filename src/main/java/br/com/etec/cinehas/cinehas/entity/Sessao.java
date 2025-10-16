package br.com.etec.cinehas.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
@Entity
@Table(name="TBL_SESSAO")
public class Sessao {
    @Id
    @Column(name="ID_SESSAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="DT_DATA")
    private LocalDate data;
    @Column(name="HR_HORARIO")
    private LocalTime horario;
    @Column(name="NR_PRECO")
    private double preco;

    @OneToOne
    @JoinColumn(name = "ID_SALA")
    private Sala sala;
    @OneToOne
    @JoinColumn(name ="ID_FILME")
    private Filme filme;

}

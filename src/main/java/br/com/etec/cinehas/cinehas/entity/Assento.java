package br.com.etec.cinehas.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "TBL_ASSENTO")
public class Assento {
    @Id
    @Column(name = "IdAssento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TX_FILEIRA")
    private String fileira;
    @Column(name = "NR_POSICAO")
    private Integer posicao;
    @OneToMany
    @JoinColumn(name="ID_SALA")
    private List<Sala> salas;
}

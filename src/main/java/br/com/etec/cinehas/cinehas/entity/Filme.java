package br.com.etec.cinehas.cinehas.entity;

import br.com.etec.cinehas.cinehas.enums.GeneroEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_FILME")
public class Filme {
    @Id
    @Column(name = "ID_FILME")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "NR_DURACAO")
    private Integer duracao;
    @Column(name = "TP_GENERO")
    @Enumerated(EnumType.STRING) //Transforma o enum do java para string no sql
    private GeneroEnum genero;
    @Column(name = "TP_CLASSIFICACAO")
    private String classificacao;
    @Column(name = "NR_ANO")
    private Integer ano;
    @Column(name = "TX_CAPA")
    private String capa;
    @Column(name = "TX_DIRETOR")
    private String diretor;
    @Column(name = "TX_ELENCO")
    private String elenco;
    @Column(name = "TX_DESCRICAO")
    private String descricao;
    @Column(name = "NR_AVALIACAO")
    private double avaliacao;
    @Column(name = "NR_PRECO")
    private double preco;
}

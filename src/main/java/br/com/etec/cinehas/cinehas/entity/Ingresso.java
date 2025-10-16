package br.com.etec.cinehas.cinehas.entity;

import br.com.etec.cinehas.cinehas.enums.TipoIngressoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_INGRESSO")
public class Ingresso {
    @Id
    @Column(name="ID_INGRESSO")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="TP_INGRESSO")
    private TipoIngressoEnum tipo;
    @Column(name="NR_PRECO")
    private Double preco;

        @OneToOne
    @JoinColumn(name="ID_SESSAO")
    private Sessao sessao;
        @OneToOne
    @JoinColumn(name="ID_PEDIDO")
    private Pedido pedido;
}

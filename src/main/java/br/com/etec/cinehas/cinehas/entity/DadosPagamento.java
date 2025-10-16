package br.com.etec.cinehas.cinehas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_DADOS_PAGAMENTO")
public class DadosPagamento {
    @Id
    @Column(name="ID_DADOS_PAGAMEMTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="ID_PAGAMENTO")
    private Pagamento pagamento;


}

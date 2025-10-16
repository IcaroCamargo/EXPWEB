package br.com.etec.cinehas.cinehas.entity;

import br.com.etec.cinehas.cinehas.enums.TipoFormaPagamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_FORMA_PAGAMENTO")
public class FormaPagamento {
    @Id
    @Column(name="ID_FORMA_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="TX_NOME")
    private String nome;
    @Column(name="TP_TIPO")
    private TipoFormaPagamentoEnum tipo;
}

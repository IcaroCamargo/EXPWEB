package br.com.etec.cinehas.cinehas.entity;

import br.com.etec.cinehas.cinehas.enums.StatusPagamentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="TBL_PAGAMENTO")
public class Pagamento {
    @Id
    @Column(name="ID_PAGAMENTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="NR_VALOR")
    private double valor;
    @Column(name="TP_STATUS")
    private StatusPagamentoEnum status;

    @OneToOne
    @JoinColumn(name="ID_PEDIDO")
    private Pedido pedido;

    @OneToMany
    @JoinColumn(name="ID_FORMA_PAGAMENTO")
    private List<FormaPagamento> formaPagamento;

}

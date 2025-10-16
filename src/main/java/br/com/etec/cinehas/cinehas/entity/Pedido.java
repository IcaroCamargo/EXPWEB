package br.com.etec.cinehas.cinehas.entity;

import br.com.etec.cinehas.cinehas.enums.StatusPedidoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name="TBL_PEDIDO")
public class Pedido {
    @Id
    @Column(name="ID_PEDIDO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="DT_CRIACAO")
    private LocalDateTime dataCriacao;
    @Column(name="TP_STATUS")
    private StatusPedidoEnum status;
}

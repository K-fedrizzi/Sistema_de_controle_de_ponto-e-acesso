package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter

    public class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimetacao;
        private long idUsuario;

    }
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime daTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}

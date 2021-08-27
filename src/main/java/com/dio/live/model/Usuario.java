package com.dio.live.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Usuario {
    private Long id;
    @ManyToOne      // relação de 1 para n
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne      // relação de 1 para n
    private Empresa empresa;
    @ManyToOne      // relação de 1 para n
    private NivelAcesso nivelAcesso;
    @ManyToOne      // relação de 1 para n
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime finalJornada;
}

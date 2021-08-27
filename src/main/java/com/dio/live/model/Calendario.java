package com.dio.live.model;

import lombok.*;

import java.time.LocalDateTime;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Calendario {
    private Long id;
    private TipoData tipoData;
    private String Descricao;
    private LocalDateTime dataEspecial;
}

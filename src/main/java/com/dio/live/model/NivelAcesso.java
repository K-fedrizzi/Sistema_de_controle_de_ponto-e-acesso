package com.dio.live.model;

import lombok.*;
// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class NivelAcesso {
    private long id;
    private String descricao;
}

package com.dio.live.model;

import lombok.*;
import javax.persistence.OneToMany;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Localidade {
    private long id;
    @OneToMany // relação de n para 1
    private NivelAcesso nivelAcesso;
    private String descricao;
}

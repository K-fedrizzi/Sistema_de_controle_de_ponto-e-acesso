package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Localidade {
    @Id
    private long id;
    @OneToOne // relação de n para 1
    private NivelAcesso nivelAcesso;
    private String descricao;
}

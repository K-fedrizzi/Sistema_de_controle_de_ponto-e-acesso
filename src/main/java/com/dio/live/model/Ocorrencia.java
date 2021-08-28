package com.dio.live.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String Descricao;
}

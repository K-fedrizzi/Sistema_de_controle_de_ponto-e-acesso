package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Calendario {
    @Id
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String Descricao;
    private LocalDateTime dataEspecial;
}

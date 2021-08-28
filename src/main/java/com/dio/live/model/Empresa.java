package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

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
@Audited
public class Empresa {
    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    private String enderenco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}

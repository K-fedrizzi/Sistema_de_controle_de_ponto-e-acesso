package com.dio.live.model;

import lombok.*;
// anotações das dependencias do lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Empresa {
    private Long id;
    private String descricao;
    private String cnpj;
    private String enderenco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}

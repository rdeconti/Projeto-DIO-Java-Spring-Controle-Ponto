package com.is4ii4s.controlepontoacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Localidade {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;

}

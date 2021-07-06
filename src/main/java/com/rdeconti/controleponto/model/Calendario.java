package com.is4ii4s.controlepontoacesso.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class Calendario {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private TipoData tipoData;

    private String descricao;
    private LocalDateTime dataEspecial;

}

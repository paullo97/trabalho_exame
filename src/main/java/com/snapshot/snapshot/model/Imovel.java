package com.snapshot.snapshot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "nativa")
    private Integer imo_id;

    @Column(name = "imo_cep", nullable = false)
    private String imo_cep;

    @Column(name="imo_numero", nullable=false)
    private Integer imo_numero;

    @Column(name="imo_bairro", nullable = false)
    private String imo_bairro;

    @Column(name = "imo_cidade", nullable = false)
    private String imo_cidade;

    @Column(name = "imo_estado", nullable = false)
    private String imo_estado;

    @Column(name = "pro_id", unique = true, nullable = false)
    private Proprietario pro_id;
}

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
public class Corretor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "nativa")
    private Integer cor_id;

    @Column(name = "cor_nome", nullable = false)
    private String cor_nome;

    @Column(name = "cor_cpf", nullable = false)
    private String cor_cpf;

    @Column(name = "cor_cnpj", nullable = false)
    private String cor_cnpj;

    @Column(name = "cor_empresa", nullable = false)
    private String cor_empresa;

}

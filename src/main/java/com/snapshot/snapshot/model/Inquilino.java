package com.snapshot.snapshot.model;


import lombok.Builder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Inquilino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "nativa")
    private Integer inq_id;

    @Column(name = "inq_nome", nullable = false )
    private String inq_nome;

    @Column(name = "inq_cpf", nullable = false)
    private String inq_cpf;

    @Column(name = "imo_iq", nullable = false)
    private Integer imo_id;



}

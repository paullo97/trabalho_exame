package com.snapshot.snapshot.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity

@Table(name = "proprietario")
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "nativa")
    private Integer pro_id;

    @Column(name = "pro_name", nullable = false)
    private String pro_name;

    @Column(name = "pro_cpf", nullable = false)
    private String pro_cpf;

    @Column(name = "pro_cnpj", nullable = false)
    private String pro_cnpj;

    public String toString(){
        return "Proprietario{" +
                "pro_cpf = " + pro_cpf +
                ", pro_name = '" + pro_name +
                ", pro_cnpj = " + pro_cnpj +
                '}';
    };
    @PrePersist
    void prePersist(){
        //Era para ter algo aqui
    }

}

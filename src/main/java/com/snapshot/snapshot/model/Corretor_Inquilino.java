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

public class Corretor_Inquilino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "nativa")
    private Integer ci_id;

    @OneToMany //Pode ter varios inquilinos
    @Column(name = "cor_id", nullable = false)
    private Integer cor_id;

    @ManyToOne //pode ter varios corretores
    @Column(name = "inq_id", nullable = false)
    private Integer inq_id;
}

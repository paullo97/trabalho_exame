package com.snapshot.snapshot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Proprietario_Corretor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "nativa")
    private Integer pc_id;

    @ManyToMany
    @Column(name = "pro_id", nullable = false)
    private Integer pro_id;

    @ManyToMany
    @Column(name = "cor_id", nullable = false)
    private Integer cor_id;

}

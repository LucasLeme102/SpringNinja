package com.SpringFiasco.FiascoSpring.Ninjas;

import com.SpringFiasco.FiascoSpring.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int idade;
    //@ManyToOne varias missoe porem um ninja so pode ter uma
    @ManyToOne
    @JoinColumn(name = "missoes_id")//F.K
    private MissoesModel missoes;



}

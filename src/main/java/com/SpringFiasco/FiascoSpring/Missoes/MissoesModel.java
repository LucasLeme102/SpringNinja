package com.SpringFiasco.FiascoSpring.Missoes;

import com.SpringFiasco.FiascoSpring.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nome;

    private String dificuldade;

    // uma missao pode ser redirecionada a mais de um ninja
    // uma missao pode ter mais de um ninja
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}

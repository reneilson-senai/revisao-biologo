package com.senai.revisao.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
@Entity
public class Biologo extends Usuario {
    private String universidade;
    private String companhia;
    private Integer codigo;
}

package com.senai.revisao.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
public class Biologo extends Usuario {
    private String universidade;
    private String companhia;
    private Integer codigo;
}

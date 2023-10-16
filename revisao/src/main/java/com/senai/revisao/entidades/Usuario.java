package com.senai.revisao.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Boolean isAdmin;
}

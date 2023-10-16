package com.senai.revisao.entidades;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
public class Registro {
    private LocalDate dataRegistro;
    private String localizacao;
    private MetodoColeta metodoDeColeta;
}

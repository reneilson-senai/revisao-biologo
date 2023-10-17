package com.senai.revisao.entidades;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
@Entity
public class Registro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataRegistro;
    private String localizacao;
    @Enumerated(EnumType.ORDINAL)
    private MetodoColeta metodoDeColeta;
    @ManyToOne
    private Especie especie;
    @ManyToOne
    private Biologo biologo;
}

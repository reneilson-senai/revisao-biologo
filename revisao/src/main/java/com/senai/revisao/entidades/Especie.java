package com.senai.revisao.entidades;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
@Entity
public class Especie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCientifico;
    private String nomeComum;
    @Enumerated(EnumType.STRING)
    private Habitat habitat;
    private String distribuicaoGeografica;
    private String caracteristicasMorfologicas;
}

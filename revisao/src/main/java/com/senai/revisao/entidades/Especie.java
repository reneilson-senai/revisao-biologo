package com.senai.revisao.entidades;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor 
@Data
public class Especie {
    private String nomeCientifico;
    private String nomeComum;
    private Habitat habitat;
    private String distribuicaoGeografica;
    private String caracteristicasMorfologicas;
}

package com.senai.revisao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.revisao.entidades.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    
}

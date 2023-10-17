package com.senai.revisao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.revisao.entidades.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {
    
}

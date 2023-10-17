package com.senai.revisao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.revisao.entidades.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
    
}

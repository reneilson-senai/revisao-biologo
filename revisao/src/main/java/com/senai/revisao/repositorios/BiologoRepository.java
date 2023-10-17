package com.senai.revisao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.revisao.entidades.Biologo;

public interface BiologoRepository extends JpaRepository<Biologo, Long>{
    
}

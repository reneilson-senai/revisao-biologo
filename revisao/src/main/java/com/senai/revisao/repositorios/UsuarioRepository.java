package com.senai.revisao.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.revisao.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}

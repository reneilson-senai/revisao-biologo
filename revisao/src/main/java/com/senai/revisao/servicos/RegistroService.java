package com.senai.revisao.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.revisao.entidades.Registro;
import com.senai.revisao.repositorios.RegistroRepository;

@Service
public class RegistroService {
    @Autowired
    private RegistroRepository repository;
    
    public Registro create(Registro registro){
        return repository.save(registro);
    }

    public Registro read(Long id){
        return repository.findById(id).get();
    }

    public Registro update(Registro registro){
        if(repository.existsById(registro.getId())){
            return repository.save(registro);
        }else{
            return null;
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Registro> list(){
        return repository.findAll();
    }
}

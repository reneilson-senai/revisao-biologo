package com.senai.revisao.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.revisao.entidades.Especie;
import com.senai.revisao.repositorios.EspecieRepository;

@Service
public class EspecieService {
    @Autowired
    private EspecieRepository repository;
    
    public Especie create(Especie especie){
        return repository.save(especie);
    }

    public Especie read(Long id){
        return repository.findById(id).get();
    }

    public Especie update(Especie especie){
        if(repository.existsById(especie.getId())){
            return repository.save(especie);
        }else{
            return null;
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Especie> list(){
        return repository.findAll();
    }
}

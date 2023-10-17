package com.senai.revisao.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.revisao.entidades.Biologo;
import com.senai.revisao.repositorios.BiologoRepository;

@Service
public class BiologoService {
    @Autowired
    private BiologoRepository repository;
    
    public Biologo create(Biologo biologo){
        return repository.save(biologo);
    }

    public Biologo read(Long id){
        return repository.findById(id).get();
    }

    public Biologo update(Biologo biologo){
        if(repository.existsById(biologo.getId())){
            return repository.save(biologo);
        }else{
            return null;
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Biologo> list(){
        return repository.findAll();
    }
}

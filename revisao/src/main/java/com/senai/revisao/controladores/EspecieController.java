package com.senai.revisao.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.revisao.entidades.Especie;
import com.senai.revisao.servicos.EspecieService;


@RequestMapping("especies")
@RestController
public class EspecieController {
    @Autowired
    private EspecieService service;

    @PostMapping
    public ResponseEntity<Especie> post(@RequestBody Especie especie){
        Especie especieCriado = service.create(especie);
        //return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(especieCriado).toUri()).build();
        return new ResponseEntity<>(especieCriado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especie> getRead(@PathVariable Long id){
        Especie especie = service.read(id);
        //return ResponseEntity.ok(especie);
        return new ResponseEntity<>(especie, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Especie>> getList(){
        List<Especie> especies = service.list();
        //return ResponseEntity.ok(especies);
        return new ResponseEntity<>(especies, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Especie> put(@RequestBody Especie especie){
        Especie especieAtualizado = service.update(especie);
        //return ResponseEntity.ok(especieAtualizado);
        return new ResponseEntity<>(especieAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        //return ResponseEntity.noContent().build();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

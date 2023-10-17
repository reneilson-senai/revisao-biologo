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

import com.senai.revisao.entidades.Biologo;
import com.senai.revisao.servicos.BiologoService;


@RequestMapping("biologos")
@RestController
public class BiologoController {
    @Autowired
    private BiologoService service;

    @PostMapping
    public ResponseEntity<Biologo> post(@RequestBody Biologo biologo){
        Biologo biologoCriado = service.create(biologo);
        //return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(biologoCriado).toUri()).build();
        return new ResponseEntity<>(biologoCriado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Biologo> getRead(@PathVariable Long id){
        Biologo biologo = service.read(id);
        //return ResponseEntity.ok(biologo);
        return new ResponseEntity<>(biologo, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Biologo>> getList(){
        List<Biologo> biologos = service.list();
        //return ResponseEntity.ok(biologos);
        return new ResponseEntity<>(biologos, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Biologo> put(@RequestBody Biologo biologo){
        Biologo biologoAtualizado = service.update(biologo);
        //return ResponseEntity.ok(biologoAtualizado);
        return new ResponseEntity<>(biologoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        //return ResponseEntity.noContent().build();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

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

import com.senai.revisao.entidades.Registro;
import com.senai.revisao.servicos.RegistroService;


@RequestMapping("registros")
@RestController
public class RegistroController {
    @Autowired
    private RegistroService service;

    @PostMapping
    public ResponseEntity<Registro> post(@RequestBody Registro registro){
        Registro registroCriado = service.create(registro);
        //return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(registroCriado).toUri()).build();
        return new ResponseEntity<>(registroCriado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Registro> getRead(@PathVariable Long id){
        Registro registro = service.read(id);
        //return ResponseEntity.ok(registro);
        return new ResponseEntity<>(registro, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Registro>> getList(){
        List<Registro> registros = service.list();
        //return ResponseEntity.ok(registros);
        return new ResponseEntity<>(registros, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Registro> put(@RequestBody Registro registro){
        Registro registroAtualizado = service.update(registro);
        //return ResponseEntity.ok(registroAtualizado);
        return new ResponseEntity<>(registroAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        //return ResponseEntity.noContent().build();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

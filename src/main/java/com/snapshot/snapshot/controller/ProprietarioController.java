package com.snapshot.snapshot.controller;

import com.snapshot.snapshot.model.Proprietario;
import com.snapshot.snapshot.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProprietarioController {

    @Autowired
    private ProprietarioRepository repository;

    ProprietarioController(ProprietarioRepository repository) {
        this.repository = repository;
    }

    //Metodo REST POST
    @PostMapping(path = "/proprietario/add")
    String postProprietario(@RequestBody Proprietario proprietario) {
        //return repository.save(proprietario);
        return "Salvo!";
    }

    //Metodo REST GET
    @GetMapping("/proprietario/getId/{id}")
    Proprietario getProprietarioId(@PathVariable Integer id) {
        return repository.get(id);
    }

    //Metodo REST DELETE
    @GetMapping("/proprietario/deleteId/{id}")
    Boolean deleteProprietarioId(@PathVariable Integer id) {
        return repository.delete(id);
    }

    //Metodo REST PUT
    @PutMapping("/proprietario/updateId/{id}")
    Proprietario putProprietarioId(@RequestBody Proprietario proprietario, @PathVariable Integer id) {
        return repository.get(id);
    }
}
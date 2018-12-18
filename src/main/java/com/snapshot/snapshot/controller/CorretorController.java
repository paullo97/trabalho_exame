package com.snapshot.snapshot.controller;

import com.snapshot.snapshot.model.Corretor;
import com.snapshot.snapshot.model.Proprietario;
import com.snapshot.snapshot.repository.CorretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CorretorController {

    @Autowired
    private CorretorRepository repository;

    CorretorController(CorretorRepository repository){
        this.repository = repository;
    }

    //Metodo REST POST
    @PostMapping(path = "/corretor/add")
    String postCorretor(@RequestBody Corretor corretor) {
        //return repository.save(corretor);
        return "Salvo!";
    }

    //Metodo REST GET
    @GetMapping("/corretor/getId/{id}")
    Corretor getCorretorId(@PathVariable Integer id) {
        return repository.get(id);
    }

    //Metodo REST DELETE
    @GetMapping("/corretor/deleteId/{id}")
    Boolean deleteCorretorId(@PathVariable Integer id) {
        return repository.delete(id);
    }

    //Metodo REST PUT
    @PutMapping("/corretor/updateId/{id}")
    Corretor putCorretorId(@RequestBody Corretor corretor, @PathVariable Integer id) {
        return repository.get(id);
    }
}

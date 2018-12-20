package com.snapshot.snapshot.controller;


import com.snapshot.snapshot.model.Inquilino;
import com.snapshot.snapshot.repository.InquilinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InquilinoController {

    @Autowired
    private InquilinoRepository repository;

    InquilinoController(InquilinoRepository repository) {
        this.repository = repository;
    }

    //Metodo REST POST
    @PostMapping(path = "/inquilino/add")
    String postInquilino(@RequestBody Inquilino inquilino) {
        return "Salvo!";
    }

    //Metodo REST GET
    @GetMapping("/inquilino/getId/{id}")
    Inquilino getInquilinoId(@PathVariable Integer id) {
        return repository.get(id);
    }

    //Metodo REST DELETE
    @DeleteMapping("/inquilino/deleteId/{id}")
    Boolean deleteInquilinoId(@PathVariable Integer id) {
        return repository.delete(id);
    }

    //Metodo REST PUT
    @PutMapping("/inquilino/updateId/{id}")
    Inquilino putInquilinoId(@RequestBody Inquilino inquilino, @PathVariable Integer id) {
        return repository.get(id);
    }
}

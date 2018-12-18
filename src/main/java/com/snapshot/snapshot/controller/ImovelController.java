package com.snapshot.snapshot.controller;


import com.snapshot.snapshot.model.Imovel;
import com.snapshot.snapshot.model.Proprietario;
import com.snapshot.snapshot.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImovelController {

    @Autowired
    private ImovelRepository repository;

    ImovelController (ImovelRepository repository){
        this.repository = repository;
    }


    //Metodo REST POST
    @PostMapping(path = "/imovel/add")
    String postImovel(@RequestBody Imovel imovel) {
        //return repository.save(proprietario);
        return "Salvo!";
    }

    //Metodo REST GET
    @GetMapping("/imovel/getId/{id}")
    Imovel getImovelId(@PathVariable Integer id) {
        return repository.get(id);
    }

    //Metodo REST DELETE
    @GetMapping("/imovel/deleteId/{id}")
    Boolean deleteImovelId(@PathVariable Integer id) {
        return repository.delete(id);
    }

    //Metodo REST PUT
    @PutMapping("/imovel/updateId/{id}")
    Imovel putImovelId(@RequestBody Imovel imovel, @PathVariable Integer id) {
        return repository.get(id);
    }

}

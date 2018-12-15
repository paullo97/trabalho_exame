package com.snapshot.snapshot.repository;


import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

import com.snapshot.snapshot.model.Corretor;
import com.snapshot.snapshot.model.Imovel;
import com.snapshot.snapshot.model.Inquilino;
import org.springframework.stereotype.Repository;
import com.snapshot.snapshot.dao.Dao;
import com.snapshot.snapshot.model.Proprietario;

public class CorretorRepository implements Dao<Corretor, Integer>{
    @Override
    public void save(Corretor entity) {

    }

    @Override
    public Corretor get(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Corretor entity) {

    }

    @Override
    public List<Corretor> getAll() {
        return null;
    }
}

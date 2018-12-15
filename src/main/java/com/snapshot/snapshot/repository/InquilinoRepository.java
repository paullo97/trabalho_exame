package com.snapshot.snapshot.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

import com.snapshot.snapshot.model.Imovel;
import com.snapshot.snapshot.model.Inquilino;
import org.springframework.stereotype.Repository;
import com.snapshot.snapshot.dao.Dao;
import com.snapshot.snapshot.model.Proprietario;

public class InquilinoRepository implements Dao<Inquilino, Integer>{
    @Override
    public void save(Inquilino entity) {

    }

    @Override
    public Inquilino get(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Inquilino entity) {

    }

    @Override
    public List<Inquilino> getAll() {
        return null;
    }
}

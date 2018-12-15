package com.snapshot.snapshot.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

import com.snapshot.snapshot.model.Imovel;
import org.springframework.stereotype.Repository;
import com.snapshot.snapshot.dao.Dao;
import com.snapshot.snapshot.model.Proprietario;

public class ImovelRepository implements Dao<Imovel, Integer>{
    @Override
    public void save(Imovel entity) {

    }

    @Override
    public Imovel get(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Imovel entity) {

    }

    @Override
    public List<Imovel> getAll() {
        return null;
    }
}

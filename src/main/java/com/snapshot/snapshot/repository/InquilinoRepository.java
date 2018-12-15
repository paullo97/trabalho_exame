package com.snapshot.snapshot.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;
import com.snapshot.snapshot.model.Inquilino;
import com.snapshot.snapshot.dao.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class InquilinoRepository implements Dao<Inquilino, Integer>{

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Inquilino entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if( entity != null){
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
        }

    }

    @Override
    public Inquilino get(Integer id) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {

    }

    @Override
    public Boolean update(Inquilino entity) {

    }

    @Override
    public List<Inquilino> getAll() {
        return null;
    }
}

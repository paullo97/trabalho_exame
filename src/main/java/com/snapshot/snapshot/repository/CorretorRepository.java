package com.snapshot.snapshot.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

import com.snapshot.snapshot.model.Corretor;
import com.snapshot.snapshot.dao.Dao;
import com.snapshot.snapshot.model.Proprietario;

public class CorretorRepository implements Dao<Corretor, Integer>{
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public Proprietario save(Corretor corretor) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if( corretor != null){
            em.persist(corretor);
            em.getTransaction().commit();
            em.close();
        }
        return null;
    }

    @Override
    public Corretor get(Integer id) {
        EntityManager em = emf.createEntityManager();
        Corretor corretor = em.find(Corretor.class, id);
        em.close();
        if( corretor != null){
            return corretor;
        }
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Corretor corretor = get(id);

        if( corretor != null) {
            em.remove(corretor);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(Corretor corretor) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (corretor != null) {
            em.merge(corretor);
        }
        try {
            em.getTransaction().commit();
            em.close();

            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    @Override
    public List<Corretor> getAll() {
        return null;
    }
}

package com.snapshot.snapshot.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;
import com.snapshot.snapshot.model.Inquilino;
import com.snapshot.snapshot.dao.Dao;
import com.snapshot.snapshot.model.Proprietario;
import org.springframework.stereotype.Repository;

@Repository
public class InquilinoRepository implements Dao<Inquilino, Integer>{

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public Proprietario save(Inquilino inquilino) {
         EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if( inquilino != null){
            em.persist(inquilino);
            em.getTransaction().commit();
            em.close();
        }
        return null;
    }

    @Override
    public Inquilino get(Integer id) {
        EntityManager em = emf.createEntityManager();
        Inquilino inquilino = em.find(Inquilino.class, id);
        em.close();
        if( inquilino != null){
            return inquilino;
        }
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Inquilino inquilino = get(id);

        if( inquilino != null) {
            em.remove(inquilino);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(Inquilino inquilino) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (inquilino != null) {
            em.merge(inquilino);
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
    public List<Inquilino> getAll() {
        return null;
    }
}

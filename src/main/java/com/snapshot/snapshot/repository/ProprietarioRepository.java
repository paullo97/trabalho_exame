package com.snapshot.snapshot.repository;

import com.snapshot.snapshot.dao.Dao;
import com.snapshot.snapshot.model.Proprietario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class ProprietarioRepository implements Dao<Proprietario, Integer> {

    @PersistenceUnit
    private EntityManagerFactory emf;


    @Override
    public void save(Proprietario entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if( entity != null ){
            em.persist(entity);
            em.getTransaction().commit();
            em.close();
        }
    }

    @Override
    public Proprietario get(Integer id) {
        EntityManager em = emf.createEntityManager();
        Proprietario proprietario = em.find(Proprietario.class, id);
        em.close();
        if( proprietario != null){
            return proprietario;
        }
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Proprietario proprietario = get(id);

        if( proprietario != null) {
            em.remove(proprietario);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(Proprietario entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (entity != null) {
            em.merge(entity);
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
    public List<Proprietario> getAll() {
        return null;
    }
}

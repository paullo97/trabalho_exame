package com.snapshot.snapshot.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

import com.snapshot.snapshot.model.Imovel;
import com.snapshot.snapshot.dao.Dao;
import org.springframework.stereotype.Repository;

@Repository
public class ImovelRepository implements Dao<Imovel, Integer>{
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Imovel imovel) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if( imovel != null){
            em.persist(imovel);
            em.getTransaction().commit();
            em.close();
        }
    }

    @Override
    public Imovel get(Integer id) {
        EntityManager em = emf.createEntityManager();
        Imovel imovel = em.find(Imovel.class, id);
        em.close();
        if( imovel != null){
            return imovel;
        }
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Imovel imovel = get(id);

        if( imovel != null) {
            em.remove(imovel);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(Imovel imovel) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        if (imovel != null) {
            em.merge(imovel);
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
    public List<Imovel> getAll() {
        return null;
    }
}

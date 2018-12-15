package com.snapshot.snapshot.dao;

import com.snapshot.snapshot.model.Proprietario;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class ProprietarioDao implements Dao<Proprietario, Integer> {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Proprietario entity){
        //Era para ter algo aqui
    }

    public Proprietario get(Integer id){
        EntityManager em = emf.createEntityManager();
        Proprietario entity = em.find(Proprietario.class, id);
        em.close();
        return entity;
    }

    public void delete(Integer id){
        //Era pra ter alguma coisa aqui
    }

    public void update(Proprietario entity){
        //Era para ter algo aqui
    }

    public List<Proprietario> getAll(){
        //Era para ter algo aqui
        return null;
    }
}

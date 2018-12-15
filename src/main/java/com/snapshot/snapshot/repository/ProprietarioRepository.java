package com.snapshot.snapshot.repository;

import com.snapshot.snapshot.model.Proprietario;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Repository
public class ProprietarioRepository implements JpaRepository<Proprietario, Integer> {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public List<Proprietario> findAll() {
        return null;
    }

    @Override
    public List<Proprietario> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Proprietario> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Proprietario> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Proprietario proprietario) {

    }

    @Override
    public void deleteAll(Iterable<? extends Proprietario> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Proprietario> S save(S s) {
        return null;
    }

    @Override
    public <S extends Proprietario> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Proprietario> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Proprietario> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Proprietario> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Proprietario getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Proprietario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Proprietario> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Proprietario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Proprietario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Proprietario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Proprietario> boolean exists(Example<S> example) {
        return false;
    }
}

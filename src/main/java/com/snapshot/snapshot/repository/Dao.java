package com.snapshot.snapshot.repository;
import java.util.List;

public interface Dao<E, I> {

    void save(E entity);

    E get(I id);

    Boolean delete(I id);

    Boolean update(E entity);

    List<E> getAll();
}
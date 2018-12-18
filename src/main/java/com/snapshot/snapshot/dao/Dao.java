package com.snapshot.snapshot.dao;
import com.snapshot.snapshot.model.Proprietario;

import java.util.List;

public interface Dao<E, I> {

    Proprietario save(E entity);

    E get(I id);

    Boolean delete(I id);

    Boolean update(E entity);

    List<E> getAll();
}
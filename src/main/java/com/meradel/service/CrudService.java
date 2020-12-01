package com.meradel.service;

import java.util.List;

public interface CrudService<T,ID> {

     /*
        Writing business logic according to the demand
     */

    List<T> findAll();

    T findById(ID id);

    void delete(T object);

    void deleteById(ID id);

    T save(T Object);

    void update(T object);

}

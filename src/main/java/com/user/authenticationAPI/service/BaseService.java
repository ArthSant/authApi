package com.user.authenticationAPI.service;


import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@AllArgsConstructor
public abstract class BaseService<T,I> {
     protected final JpaRepository <T,I> repository;

     void save(T entity) {
         repository.save(entity);
     }

     T getReferenceById(I id) {
         return repository.getReferenceById(id);
     }
    void delete(T entity) {
         repository.delete(entity);
    }

    List<T> findAll() {
         return repository.findAll();
     }

}

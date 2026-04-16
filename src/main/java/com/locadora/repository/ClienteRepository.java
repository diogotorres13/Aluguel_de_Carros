package com.locadora.repository;

import com.locadora.model.Cliente;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    // Aqui você já ganha os métodos: save, findAll, findById, delete, etc.
}
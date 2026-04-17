package com.locadora.repository;

import com.locadora.model.Cliente;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    // Ao estender CrudRepository, o Micronaut gera automaticamente o método save()
}
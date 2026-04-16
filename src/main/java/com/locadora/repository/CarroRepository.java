package com.locadora.repository;

import com.locadora.model.Carro;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Long> {
}
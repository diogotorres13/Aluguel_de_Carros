package com.locadora.repository;

import com.locadora.model.Pedido;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
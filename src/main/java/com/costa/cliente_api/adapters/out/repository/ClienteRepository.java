package com.costa.cliente_api.adapters.out.repository;

import com.costa.cliente_api.adapters.out.repository.entity.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}

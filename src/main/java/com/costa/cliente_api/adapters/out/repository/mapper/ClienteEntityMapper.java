package com.costa.cliente_api.adapters.out.repository.mapper;

import com.costa.cliente_api.adapters.out.repository.entity.ClienteEntity;
import com.costa.cliente_api.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {

    ClienteEntity toClienteEntity(Cliente cliente);

    Cliente toCliente(ClienteEntity clienteEntity);

}

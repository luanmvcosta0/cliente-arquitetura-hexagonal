package com.costa.cliente_api.adapters.in.controller.mapper;

import com.costa.cliente_api.adapters.in.controller.request.ClienteRequest;
import com.costa.cliente_api.adapters.in.controller.response.ClienteResponse;
import com.costa.cliente_api.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    @Mapping(target = "cpfValido", ignore = true)
    Cliente toCliente(ClienteRequest clienteRequest);

    ClienteResponse toClienteResponse(Cliente cliente);

}

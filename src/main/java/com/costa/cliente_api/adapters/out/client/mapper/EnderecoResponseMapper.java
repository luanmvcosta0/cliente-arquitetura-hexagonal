package com.costa.cliente_api.adapters.out.client.mapper;

import com.costa.cliente_api.adapters.out.client.response.EnderecoResponse;
import com.costa.cliente_api.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoResponseMapper {

    Endereco toEndereco(EnderecoResponse enderecoResponse);

}

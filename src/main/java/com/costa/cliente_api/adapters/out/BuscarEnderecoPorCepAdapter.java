package com.costa.cliente_api.adapters.out;

import com.costa.cliente_api.adapters.out.client.BuscarEnderecoPorCepClient;
import com.costa.cliente_api.adapters.out.client.mapper.EnderecoResponseMapper;
import com.costa.cliente_api.application.core.domain.Endereco;
import com.costa.cliente_api.application.ports.out.BuscarEnderecoPorCepOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepAdapter implements BuscarEnderecoPorCepOutPutPort {

    @Autowired
    private BuscarEnderecoPorCepClient buscarEnderecoPorCepClient;

    @Autowired
    private EnderecoResponseMapper enderecoResponseMapper;

    @Override
    public Endereco buscar(String cep) {
        var enderecoResponse = buscarEnderecoPorCepClient.buscar(cep);
        return enderecoResponseMapper.toEndereco(enderecoResponse);
    }

}

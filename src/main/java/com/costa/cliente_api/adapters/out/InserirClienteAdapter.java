package com.costa.cliente_api.adapters.out;

import com.costa.cliente_api.adapters.out.repository.ClienteRepository;
import com.costa.cliente_api.adapters.out.repository.mapper.ClienteEntityMapper;
import com.costa.cliente_api.application.core.domain.Cliente;
import com.costa.cliente_api.application.ports.out.InserirClienteOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InserirClienteAdapter implements InserirClienteOutPutPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public void inserir(Cliente cliente) {
        var clienteEntity = clienteEntityMapper.toClienteEntity(cliente);
        clienteRepository.save(clienteEntity);
    }

}
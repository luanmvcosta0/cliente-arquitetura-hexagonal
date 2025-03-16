package com.costa.cliente_api.adapters.out;

import com.costa.cliente_api.adapters.out.repository.ClienteRepository;
import com.costa.cliente_api.adapters.out.repository.mapper.ClienteEntityMapper;
import com.costa.cliente_api.application.core.domain.Cliente;
import com.costa.cliente_api.application.ports.out.AtualizarClienteOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtualizarClienteAdapter implements AtualizarClienteOutPutPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapperMapper;

    @Override
    public void atualizar(Cliente cliente) {
        var clienteEntity = clienteEntityMapperMapper.toClienteEntity(cliente);
        clienteRepository.save(clienteEntity);
    }

}

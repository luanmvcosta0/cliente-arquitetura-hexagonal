package com.costa.cliente_api.adapters.out;

import com.costa.cliente_api.adapters.out.repository.ClienteRepository;
import com.costa.cliente_api.adapters.out.repository.mapper.ClienteEntityMapper;
import com.costa.cliente_api.application.core.domain.Cliente;
import com.costa.cliente_api.application.ports.out.BuscarClientePorIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class BuscarClientePorIdAdapter implements BuscarClientePorIdOutPutPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public Optional<Cliente> buscar(String id) {
        var clienteEntity = clienteRepository.findById(id);
        return clienteEntity.map(entity -> clienteEntityMapper.toCliente(entity));
    }

}

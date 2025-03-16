package com.costa.cliente_api.adapters.out;

import com.costa.cliente_api.adapters.out.repository.ClienteRepository;
import com.costa.cliente_api.application.ports.out.DeletarClienteOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletarClientePorIdAdapter implements DeletarClienteOutPutPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void deletar(String id) {
        clienteRepository.deleteById(id);
    }

}

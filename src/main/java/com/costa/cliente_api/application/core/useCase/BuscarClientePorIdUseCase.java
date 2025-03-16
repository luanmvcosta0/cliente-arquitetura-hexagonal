package com.costa.cliente_api.application.core.useCase;

import com.costa.cliente_api.application.core.domain.Cliente;
import com.costa.cliente_api.application.ports.in.BuscarClientePorIdInputPort;
import com.costa.cliente_api.application.ports.out.BuscarClientePorIdOutPutPort;

public class BuscarClientePorIdUseCase implements BuscarClientePorIdInputPort {

    private final BuscarClientePorIdOutPutPort buscarClientePorIdOutPutPort;

    public BuscarClientePorIdUseCase(BuscarClientePorIdOutPutPort buscarClientePorIdOutPutPort) {
        this.buscarClientePorIdOutPutPort = buscarClientePorIdOutPutPort;
    }

    @Override
    public Cliente buscar(String id) {
        return buscarClientePorIdOutPutPort.buscar(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

}

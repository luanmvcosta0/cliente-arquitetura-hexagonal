package com.costa.cliente_api.application.core.useCase;

import com.costa.cliente_api.application.ports.in.BuscarClientePorIdInputPort;
import com.costa.cliente_api.application.ports.in.DeletarClientePorIdInputPort;
import com.costa.cliente_api.application.ports.out.DeletarClientePorIdOutPutPort;

public class DeletarClientePorId implements DeletarClientePorIdInputPort {

    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final DeletarClientePorIdOutPutPort deletarClienteOutPutPort;

    public DeletarClientePorId(
            BuscarClientePorIdInputPort buscarClientePorIdInputPort,
            DeletarClientePorIdOutPutPort deletarClienteOutPutPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.deletarClienteOutPutPort = deletarClienteOutPutPort;
    }

    @Override
    public void deletar(String id) {
        buscarClientePorIdInputPort.buscar(id);
        deletarClienteOutPutPort.deletar(id);
    }

}

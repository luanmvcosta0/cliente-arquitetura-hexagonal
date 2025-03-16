package com.costa.cliente_api.application.core.useCase;

import com.costa.cliente_api.application.ports.in.BuscarClientePorIdInputPort;
import com.costa.cliente_api.application.ports.out.DeletarClienteOutPutPort;

public class DeletarClientePorId {

    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final DeletarClienteOutPutPort deletarClienteOutPutPort;

    public DeletarClientePorId(
            BuscarClientePorIdInputPort buscarClientePorIdInputPort,
            DeletarClienteOutPutPort deletarClienteOutPutPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.deletarClienteOutPutPort = deletarClienteOutPutPort;
    }

    public void deletar(String id) {
        buscarClientePorIdInputPort.buscar(id);
        deletarClienteOutPutPort.deletar(id);
    }

}

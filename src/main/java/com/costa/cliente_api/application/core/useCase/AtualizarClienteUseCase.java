package com.costa.cliente_api.application.core.useCase;

import com.costa.cliente_api.application.core.domain.Cliente;
import com.costa.cliente_api.application.ports.in.BuscarClientePorIdInputPort;
import com.costa.cliente_api.application.ports.out.AtualizarClienteOutPutPort;
import com.costa.cliente_api.application.ports.out.BuscarEnderecoPorCepOutPutPort;

public class AtualizarClienteUseCase {

    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final BuscarEnderecoPorCepOutPutPort buscarEnderecoPorCepOutPutPort;
    private final AtualizarClienteOutPutPort atualizarClienteOutPutPort;

    public AtualizarClienteUseCase(
            BuscarClientePorIdInputPort buscarClientePorIdInputPort,
            BuscarEnderecoPorCepOutPutPort buscarEnderecoPorCepOutPutPort,
            AtualizarClienteOutPutPort atualizarClienteOutPutPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.buscarEnderecoPorCepOutPutPort = buscarEnderecoPorCepOutPutPort;
        this.atualizarClienteOutPutPort = atualizarClienteOutPutPort;
    }

    public void atualizar(Cliente cliente, String cep) {
        buscarClientePorIdInputPort.buscar(cliente.getId());
        var endereco = buscarEnderecoPorCepOutPutPort.buscar(cep);
        cliente.setEndereco(endereco);
        atualizarClienteOutPutPort.atualizar(cliente);
    }

}

package com.costa.cliente_api.application.core.useCase;

import com.costa.cliente_api.application.core.domain.Cliente;
import com.costa.cliente_api.application.ports.in.InserirClienteInputPort;
import com.costa.cliente_api.application.ports.out.BuscarEnderecoPorCepOutPutPort;
import com.costa.cliente_api.application.ports.out.InserirClienteOutPutPort;

public class InserirClienteUseCase implements InserirClienteInputPort {

    private final BuscarEnderecoPorCepOutPutPort buscarEnderecoPorCepOutPutPort;
    private final InserirClienteOutPutPort inserirClienteOutPutPort;

    public InserirClienteUseCase(
            BuscarEnderecoPorCepOutPutPort buscarEnderecoPorCepOutPutPort,
            InserirClienteOutPutPort inserirClienteOutPutPort) {
        this.buscarEnderecoPorCepOutPutPort = buscarEnderecoPorCepOutPutPort;
        this.inserirClienteOutPutPort = inserirClienteOutPutPort;
    }

    @Override
    public void inserir(Cliente cliente, String cep) {
        var endereco = buscarEnderecoPorCepOutPutPort.buscar(cep);
        cliente.setEndereco(endereco);
        inserirClienteOutPutPort.inserir(cliente);
    }

}

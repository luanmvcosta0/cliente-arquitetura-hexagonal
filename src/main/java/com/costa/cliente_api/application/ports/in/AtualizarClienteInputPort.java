package com.costa.cliente_api.application.ports.in;

import com.costa.cliente_api.application.core.domain.Cliente;

public interface AtualizarClienteInputPort {

    void atualizar(Cliente cliente, String cep);

}

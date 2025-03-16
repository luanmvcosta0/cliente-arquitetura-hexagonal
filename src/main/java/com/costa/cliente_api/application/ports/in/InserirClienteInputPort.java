package com.costa.cliente_api.application.ports.in;

import com.costa.cliente_api.application.core.domain.Cliente;

public interface InserirClienteInputPort {

    void inserir(Cliente cliente, String cep);

}

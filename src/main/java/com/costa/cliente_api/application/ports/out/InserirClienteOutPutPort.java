package com.costa.cliente_api.application.ports.out;

import com.costa.cliente_api.application.core.domain.Cliente;

public interface InserirClienteOutPutPort {

    void inserir(Cliente cliente);

}

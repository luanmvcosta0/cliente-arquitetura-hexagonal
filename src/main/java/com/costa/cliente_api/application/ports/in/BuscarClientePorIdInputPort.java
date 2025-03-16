package com.costa.cliente_api.application.ports.in;

import com.costa.cliente_api.application.core.domain.Cliente;

public interface BuscarClientePorIdInputPort {

    Cliente buscar(String id);

}
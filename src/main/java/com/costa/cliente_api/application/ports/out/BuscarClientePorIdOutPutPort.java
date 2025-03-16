package com.costa.cliente_api.application.ports.out;

import com.costa.cliente_api.application.core.domain.Cliente;

import java.util.Optional;

public interface BuscarClientePorIdOutPutPort {

    Optional<Cliente> buscar(String id);

}

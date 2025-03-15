package com.costa.cliente_api.application.ports.out;

import com.costa.cliente_api.application.core.domain.Endereco;

public interface BuscarEnderecoPorCepOutPutPort {

    Endereco find(String cep);

}

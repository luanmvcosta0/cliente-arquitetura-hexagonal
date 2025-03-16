package com.costa.cliente_api.adapters.in.controller.response;

import com.costa.cliente_api.application.core.domain.Endereco;
import lombok.Data;

@Data
public class ClienteResponse {

    private String nome;
    private EnderecoResponse enderecoResponse;
    private String cpf;
    private Boolean cpfValido;

}

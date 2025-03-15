package com.costa.cliente_api.adapters.out.client;

import com.costa.cliente_api.adapters.out.client.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "BuscarEnderecoPorCepClient",
        url = "${costa.client.endereco.url}"
)
public interface BuscarEnderecoPorCepClient {

    @GetMapping("/{cep}")
    EnderecoResponse buscar(@PathVariable("cep") String cep);

}

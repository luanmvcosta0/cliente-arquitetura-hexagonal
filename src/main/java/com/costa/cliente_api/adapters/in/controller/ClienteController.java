package com.costa.cliente_api.adapters.in.controller;

import com.costa.cliente_api.adapters.in.controller.mapper.ClienteMapper;
import com.costa.cliente_api.adapters.in.controller.request.ClienteRequest;
import com.costa.cliente_api.adapters.in.controller.response.ClienteResponse;
import com.costa.cliente_api.application.ports.in.BuscarClientePorIdInputPort;
import com.costa.cliente_api.application.ports.in.InserirClienteInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/clientes")
public class ClienteController {

    @Autowired
    private InserirClienteInputPort inserirClienteInputPort;

    @Autowired
    private BuscarClientePorIdInputPort buscarClientePorIdInputPort;

    @Autowired
    private ClienteMapper clienteMapper;

    @PostMapping("")
    public ResponseEntity<Void> inserir(@Valid @RequestBody ClienteRequest clienteRequest) {
        var cliente = clienteMapper.toCliente(clienteRequest);
        inserirClienteInputPort.inserir(cliente, clienteRequest.getCep());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> buscarPorId(@PathVariable String id) {
        var cliente = buscarClientePorIdInputPort.buscar(id);
        var clienteResponse = clienteMapper.toClienteResponse(cliente);
        return ResponseEntity.ok().body(clienteResponse);
    }

}

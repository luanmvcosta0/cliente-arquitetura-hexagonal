package com.costa.cliente_api.application.core.domain;

public class Cliente {

    private String id;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private Boolean cpfValido;

    public Cliente() {
        this.cpfValido = false;
    }

    public Cliente(String id, String nome, Endereco endereco, String cpf, Boolean cpfValido) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cpfValido = cpfValido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getCpfValido() {
        return cpfValido;
    }

    public void setCpfValido(Boolean cpfValido) {
        this.cpfValido = cpfValido;
    }
}

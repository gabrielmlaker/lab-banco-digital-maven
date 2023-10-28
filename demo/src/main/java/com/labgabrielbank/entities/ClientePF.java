package com.labgabrielbank.entities;

import lombok.Setter;

public class ClientePF extends Cliente {
    @Setter
    private String cpf;

    public ClientePF(String nome, String cpf, String telefone, Endereco endereco, Conta conta) {
        super(nome, telefone, endereco, conta);
        this.cpf = cpf;
    }

    public ClientePF() {
    }

    public String getCpf() {
        return cpf;
    }

}

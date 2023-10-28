package com.labgabrielbank.entities;

import lombok.Getter;
import lombok.Setter;

public class ClientePJ extends Cliente {

    @Getter @Setter
    protected String cnpj;

    public ClientePJ(String nome, String cnpj, String telefone, Endereco endereco, Conta conta) {
        super(nome, telefone, endereco, conta);
        // TODO Auto-generated constructor stub
        this.cnpj = cnpj;

    }

    public ClientePJ(){
        
    }

}

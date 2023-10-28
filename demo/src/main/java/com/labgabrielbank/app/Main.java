package com.labgabrielbank.app;

import com.labgabrielbank.db.Banco;
import com.labgabrielbank.entities.ClientePF;
import com.labgabrielbank.entities.ClientePJ;
import com.labgabrielbank.entities.Conta;
import com.labgabrielbank.entities.ContaCorrente;
import com.labgabrielbank.entities.ContaPoupanca;
import com.labgabrielbank.entities.Endereco;

public class Main {

    public static void main(String[] args) {

        Endereco enderecoCliente1 = new Endereco();
        enderecoCliente1.setCep("12358-321");
        enderecoCliente1.setLogradouro("Rua A");
        enderecoCliente1.setNumero("11");
        enderecoCliente1.setComplemento("Complemento 1");
        enderecoCliente1.setCidade("Cidade A");
        enderecoCliente1.setUF("SP");
        enderecoCliente1.setPais("Brasil");

        ClientePF cliente1 = new ClientePF();
        cliente1.setNome("Joao A");
        cliente1.setTelefone("12345678977");
        cliente1.setCpf("123.456.789-01");
        cliente1.setEndereco(enderecoCliente1);

        Conta ccCliente1 = new ContaCorrente();
        Conta cpCliente1 = new ContaPoupanca();
        cliente1.setConta(ccCliente1);
        cliente1.setConta(cpCliente1);

        Endereco enderecoCliente2 = new Endereco();
        enderecoCliente2.setCep("98765-432");
        enderecoCliente2.setLogradouro("Rua B");
        enderecoCliente2.setNumero("112");
        enderecoCliente2.setComplemento(null);
        enderecoCliente2.setCidade("Cidade ABC123");
        enderecoCliente2.setUF("SP");
        enderecoCliente2.setPais("Brasil");

        ClientePJ cliente2 = new ClientePJ();
        cliente2.setNome("Maria B");
        cliente2.setCnpj("987-654-321");
        cliente2.setTelefone("11942885555");
        cliente2.setEndereco(enderecoCliente2);
        
        
        Conta ccCliente2 = new ContaCorrente();
        cliente2.setConta(ccCliente2);

        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        banco.listarClientes();
        System.out.println();
        banco.listarContas();
        System.out.println();
        ccCliente1.imprimirExtrato();
        System.out.println();
        ccCliente2.imprimirExtrato();
    }
}
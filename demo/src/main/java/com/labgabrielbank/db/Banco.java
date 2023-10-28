package com.labgabrielbank.db;

import java.util.ArrayList;
import java.util.List;

import com.labgabrielbank.entities.Cliente;
import com.labgabrielbank.entities.ClientePF;
import com.labgabrielbank.entities.ClientePJ;


import lombok.Data;

@Data
public class Banco {
    private List<Cliente> clientes;

    public Banco() {

        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void listarClientes() {
        System.out.println("Lista de clientes");
        for (Cliente cliente : clientes) {
            System.out.println(String.format("Nome: %s, Conta: %d, Agencia: %d\n",
                    cliente.getNome(),
                    cliente.getConta().getNumero(),
                    cliente.getConta().getAgencia()));

        }
    }

    public void listarContas() {
        System.out.println("Lista de contas:");
        System.out.println("------------------------------");
        for (Cliente cliente : clientes) {
            System.out.println("Nome do cliente: " + cliente.getNome());
            System.out.println("Numero da conta: " + cliente.getConta().getNumero());
            System.out.println("Numero da agencia: " + cliente.getConta().getAgencia());
            if (cliente instanceof ClientePF) {
                System.out.println("Tipo de Cliente: Pessoa Física");
                System.out.println("CPF: " + ((ClientePF) cliente).getCpf());
            } else if (cliente instanceof ClientePJ) {
                System.out.println("Tipo de Cliente: Pessoa Jurídica");
                System.out.println("CNPJ: " + ((ClientePJ) cliente).getCnpj());
            }
            System.out.println("--------------------------------");
        }

    }

}

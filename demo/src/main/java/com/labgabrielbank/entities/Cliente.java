package com.labgabrielbank.entities;

import lombok.Data;

@Data
public abstract class Cliente {

	private String nome;
	private String telefone;
	private Endereco endereco;
	private Conta conta;

	public Cliente(String nome, String telefone, Endereco endereco, Conta conta) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.conta = conta;
	}

	public Cliente(){
		
	}

	public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + telefone);
        System.out.println(endereco.imprimirEndereco());
        System.out.println("Número da Conta: " + conta.getNumero() + "/nNumemero da agencia: " + conta.getAgencia());
    }

}

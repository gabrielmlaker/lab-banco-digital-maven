package com.labgabrielbank.entities;

public class ContaCorrente extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		
		super.imprimirInfosComuns();
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("=== Transferencia de " + valor + " feita com sucesso ===");
	}

}

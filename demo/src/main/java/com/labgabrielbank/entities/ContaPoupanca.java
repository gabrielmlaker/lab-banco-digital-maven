package com.labgabrielbank.entities;

public class ContaPoupanca extends Conta {

    @Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
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

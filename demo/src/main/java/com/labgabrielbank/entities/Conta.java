package com.labgabrielbank.entities;

import com.labgabrielbank.interfaces.IConta;

import lombok.Data;
import lombok.Getter;

@Data
public class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	@Getter
	protected int agencia;
	@Getter
	protected int numero;
	@Getter
	protected double saldo;

	@Getter
	protected Cliente cliente;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d, Numero: %d, Saldo: %.2f",
				agencia, numero, saldo));
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub

	}
}

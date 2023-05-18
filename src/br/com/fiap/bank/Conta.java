package br.com.fiap.bank;

public class Conta {

	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
}

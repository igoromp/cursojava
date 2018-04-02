package com.edu.curso.polimorfismo;

public class Conta {
	protected double saldo;
	
	
	
	public Conta() {}
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

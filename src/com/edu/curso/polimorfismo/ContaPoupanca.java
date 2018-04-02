package com.edu.curso.polimorfismo;

public class ContaPoupanca  extends  Conta{
	protected  double rendimentos = 30;

	
	public  ContaPoupanca() {}
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}



	public double getRendimentos() {
		return rendimentos;
	}
	
	
}

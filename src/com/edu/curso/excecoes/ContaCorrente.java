package com.edu.curso.excecoes;

public class ContaCorrente {
	private Double saldo;
	
	
	public ContaCorrente(Double saldo) {
		this.saldo = saldo;
	}
	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double dep) {
		if (dep <= 0 ) {
			error("O valor de depósito não pode ser menor ou igual que zero");
		}		
		this.saldo += dep;
	}
	
	public void sacar(Double sacar ) throws SaldoInsuficienteException {
		if (sacar <= 0 ) 
			error("O valor de saque  não pode ser menor ou igual que zero");
		
		if (this.saldo <= 0 )
			errorSaldo("Conta não tem saldo suficiente");
		
		if (sacar > this.saldo)
			error("Valor de saque é maior do que o disponível");
		
		this.saldo -=sacar;
		
	}
	
	public void saldo (){
		System.out.println("Saldo:"+ this.getSaldo());
	}
	private IllegalArgumentException error(String msg){
		throw new IllegalArgumentException(msg);
	}
	
	private SaldoInsuficienteException errorSaldo( String msg) throws SaldoInsuficienteException{
		throw new SaldoInsuficienteException(msg);
	}
}

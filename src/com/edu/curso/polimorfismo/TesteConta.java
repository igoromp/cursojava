package com.edu.curso.polimorfismo;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta(4000.00);
		ContaCorrente cc= new ContaCorrente();
		cc.setSaldo(3500);
		Conta cp = new ContaPoupanca(3000.00);
		 
		
		/*Não é possível acessar o methodo cp.getRendimentos()
		pos cp foi declarado como Conta */
		
		//imprimirSaldo(conta);
		//imprimirSaldo(cc);
		imprimirSaldo(cp);
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta:R$ "+conta.getSaldo());
		
		if(conta instanceof ContaPoupanca){
			ContaPoupanca contaNew =(ContaPoupanca) conta;
			System.out.println("O rendimento do mês é "+contaNew.getRendimentos());
		}
		
		if(conta instanceof ContaCorrente){
			ContaCorrente contaNew = (ContaCorrente) conta;
			System.out.println("O limite é "+contaNew.getLimite() +" reais");
		}
	}
}

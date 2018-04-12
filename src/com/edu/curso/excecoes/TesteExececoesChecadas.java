package com.edu.curso.excecoes;

public class TesteExececoesChecadas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1500.00);
		
		try{
			cc.depositar(100.00);
			cc.saldo();
			//cc.depositar(-15.00);
			cc.sacar(600.00);
			cc.saldo();
			cc.sacar(1000.00);
			//cc.sacar(-500.00);
			//cc.sacar(1200.00);
			cc.saldo();
			cc.sacar(1.00);
			
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} finally{
			System.out.println("Obrigado por usar nosso sistema.");
		}
	}

}

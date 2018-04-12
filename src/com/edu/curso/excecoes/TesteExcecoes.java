package com.edu.curso.excecoes;

public class TesteExcecoes {
	public static void main(String[] args) {
		
		try{
			int num = 5/0;	
			System.out.println(num);
		}catch(ArithmeticException e){
			System.out.println("Erro de Divisão "+  e.getMessage());
		}
		
		ContaCorrente cc = new ContaCorrente(1000.00);
		
		try{
			cc.depositar(-15.5);
			System.out.println("Saldo: " + cc.getSaldo());
		}catch(IllegalArgumentException e){
			System.out.println("Você executou uma operação ilegal:"+ e.getMessage());
		}
		
	}
}

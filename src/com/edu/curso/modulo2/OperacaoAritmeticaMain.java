package com.edu.curso.modulo2;

public class OperacaoAritmeticaMain {

	public static void main(String[] args) {
		
		for (OperacaoAritmeticaEnum oa : OperacaoAritmeticaEnum.values()){
			System.out.println(oa+" -> "+ oa.operacao(10, 4));
		}

	}

}

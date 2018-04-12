package com.edu.curso.coleta_de_lixo;

public class TesteColector {
	public static void main(String[] args) {
		Carro carro = new Carro.CarroBuilder()
			.marca("Fiat")
			.modelo("Siena")
			.anoFabricacao(2015)
			.createCarro();
		
		System.out.println(carro.toString());
		
		/* Definindo carro como null, ele está apto a ser escolhido 
		 * pelo Garbage Colector.
		 * 
		 * Ao execultar o algoritmo abaixo ele dara um erro de NullPointerException
		 * 
		 * carro = null;		
		System.out.println(carro.toString());*/
	}
}

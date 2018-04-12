package com.edu.curso.padroe_de_projeto.prototype;

public class TestePartitura {

	public static void main(String[] args) {
		//Carregar os diferentes tipos de notas musicais
		Partitura.carregarNotas();
		
		// Compor a canção
		Partitura.getNota("DO").desenha();
		Partitura.getNota("RE").desenha();
		Partitura.getNota("MI").desenha();
		Partitura.getNota("FA").desenha();
		Partitura.getNota("FA").desenha();
		Partitura.getNota("FA").desenha();
		Partitura.getNota("DO").desenha();
		Partitura.getNota("RE").desenha();
		Partitura.getNota("DO").desenha();
		Partitura.getNota("RE").desenha();
		Partitura.getNota("RE").desenha();
		Partitura.getNota("RE").desenha();
		
	}

}

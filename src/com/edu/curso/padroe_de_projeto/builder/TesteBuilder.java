package com.edu.curso.padroe_de_projeto.builder;

public class TesteBuilder {
	public static void main(String[] args) {
		Cozinha cozinha = new Cozinha();
		
//		BUILDERS
		SanduicheBuilder ham = new HamburguerBuilder();
		SanduicheBuilder fish = new FishburguerBuider();
		
		cozinha.fazSanduiche(ham);
		cozinha.fazSanduiche(fish);
		
		ham.getSanduiche();
		fish.getSanduiche();
	}
}

package com.edu.curso.padroe_de_projeto.builder;

public class FishburguerBuider extends SanduicheBuilder {
	
	private Sanduiche s = new Fishburguer();
 	
	@Override
	public void abrePao() {
		System.out.println("Abre o pão de fishburguer");
		
	}

	@Override
	public void insereIngredientes() {
		System.out.println("Insere o filé de peixe");
		
	}

	@Override
	public void fechaPao() {
		System.out.println("Fecha pão de fishburguer");
		
	}

	@Override
	public Sanduiche getSanduiche() {
		System.out.println("Fishburguer está pronto");
		return s;
	}
	
}

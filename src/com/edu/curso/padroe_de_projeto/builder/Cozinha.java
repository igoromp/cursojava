package com.edu.curso.padroe_de_projeto.builder;

public class Cozinha {
	public void fazSanduiche(SanduicheBuilder builder){
		builder.abrePao();
		builder.insereIngredientes();
		builder.fechaPao();
	}
}

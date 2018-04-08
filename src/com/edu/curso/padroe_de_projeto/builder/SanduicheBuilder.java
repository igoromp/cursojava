package com.edu.curso.padroe_de_projeto.builder;

public abstract class SanduicheBuilder {
	public abstract  void abrePao() ;
	public abstract void insereIngredientes();
	public abstract void fechaPao();
	public abstract Sanduiche getSanduiche();
}

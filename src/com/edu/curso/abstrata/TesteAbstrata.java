package com.edu.curso.abstrata;

public class TesteAbstrata {

	public static void main(String[] args) {
		Produto p = new ProdutoPerecivel();
		p.desc = "Leite Misturou Legal";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade="09/06/2018";
		
		pp.imprimirDesc();

	}

}

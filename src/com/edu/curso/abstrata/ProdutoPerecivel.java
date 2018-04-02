package com.edu.curso.abstrata;

public class ProdutoPerecivel  extends Produto{
	
	
	String dataValidade;// Somente para exemplo
	
	@Override
	public void imprimirDesc() {
		//implementar a lógica
		System.out.println("Desc:"+super.getDesc()+"\nValidade:"+dataValidade);
	}
	
	
}

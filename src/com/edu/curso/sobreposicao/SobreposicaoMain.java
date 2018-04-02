package com.edu.curso.sobreposicao;

import java.util.Date;

public class SobreposicaoMain {
	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.desc = "Coca-Cola 2L";
		pp.dataValidade= new Date();
		
		pp.identificar();
	}
}

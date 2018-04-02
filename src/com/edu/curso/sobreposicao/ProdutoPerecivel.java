package com.edu.curso.sobreposicao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {
	
	protected static SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
	protected Date dataValidade;
	
	public void identificar() {
		super.identificar();
		System.out.println("Validade:"+form.format(dataValidade));
	}
}

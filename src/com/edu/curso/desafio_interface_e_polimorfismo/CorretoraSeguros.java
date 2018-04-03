package com.edu.curso.desafio_interface_e_polimorfismo;

public class CorretoraSeguros {
	
	public void fazerPropostaSeguro(Seguravel objSeguravel) {
			System.out.println("----------------");
			System.out.println("Corretora de Seguros - Proposta");
			System.out.println(objSeguravel.obterDescricao());
			System.out.println("Valor da apólice:"+objSeguravel.calcularValorApolice());
			System.out.println("-----------------");
	}
}

package com.edu.curso.desafio_interface_e_polimorfismo;

public class Imovel  implements  Seguravel{

	private double valorMercado;
	private int areaConstrucao;
	
	
	
	public Imovel(double valorMercado, int areaConstrucao) {
		
		this.valorMercado = valorMercado;
		this.areaConstrucao = areaConstrucao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.003;
		valorApolice = valorApolice + (areaConstrucao * 0.05);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		
		return "O imóvel com área construída de "+this.areaConstrucao +"m2 e valor de mercado "+this.valorMercado;
	}

	
}

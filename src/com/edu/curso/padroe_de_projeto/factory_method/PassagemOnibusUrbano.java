package com.edu.curso.padroe_de_projeto.factory_method;

import java.util.Calendar;

//Produto Concreto
public class PassagemOnibusUrbano  extends Passagem{

	public PassagemOnibusUrbano(String origem, String destino,
			Calendar dataHoraPartida) {
		super(origem, destino, dataHoraPartida);
		// TODO Auto-generated constructor stub
	}
	
	public void exibirDetalhes() {
		System.out.println("Passagem de ônibus urbano:"
				+ "\nOrigem:"+ this.getOrigem()
				+"\nDestino:"+ this.getDestino()
				+ "\nData/Hora"+ super.df.format(this.getDataHoraPartida().getTime())+"\n");	
	}
}

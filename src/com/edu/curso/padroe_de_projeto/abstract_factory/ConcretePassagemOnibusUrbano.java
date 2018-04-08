package com.edu.curso.padroe_de_projeto.abstract_factory;

import java.util.Calendar;

public class ConcretePassagemOnibusUrbano  extends PassagemOnibusUrbano{

	public ConcretePassagemOnibusUrbano(String origem, String destino,
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

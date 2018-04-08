package com.edu.curso.padroe_de_projeto.abstract_factory;

import java.util.Calendar;

public class ConcretePassagemOnibusInterestadual extends PassagemOnibusInterestadual {

	public ConcretePassagemOnibusInterestadual(String origem, String destino,
			Calendar dataHoraPartida) {
		super(origem, destino, dataHoraPartida);
		
	}
	
	public void exibirDetalhes() {
		System.out.println("Passagem de ônibus Interestadual:"
				+ "\nOrigem:"+ this.getOrigem()
				+"\nDestino:"+ this.getDestino()
				+ "\nData/Hora"+ super.df.format(this.getDataHoraPartida().getTime())+"\n");	
	}
}

package com.edu.curso.padroe_de_projeto.abstract_factory;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibusAbstractFactory {

	@Override
	public PassagemOnibusInterestadual emitePassagemOnibusInterestadual(
			String origem, String destino, Calendar dataHoraPartida) {
		
		return new ConcretePassagemOnibusInterestadual(origem, destino, dataHoraPartida);
	}

	@Override
	public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem,
			String destino, Calendar dataHoraPartida) {
		// TODO Auto-generated method stub
		return new ConcretePassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}

}

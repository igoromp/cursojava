package com.edu.curso.padroe_de_projeto.abstract_factory;

import java.util.Calendar;

public abstract class EmpresaOnibusAbstractFactory {
	
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual( String origem, String destino, Calendar dataHoraPartida); 
	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano( String origem, String destino, Calendar dataHoraPartida); 
}

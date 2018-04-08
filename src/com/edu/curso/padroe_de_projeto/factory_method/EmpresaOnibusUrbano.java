package com.edu.curso.padroe_de_projeto.factory_method;

import java.util.Calendar;

//Fabrica concreta
public class EmpresaOnibusUrbano  extends Empresa{

	@Override
	public Passagem emitePassagem(String origem, String destino,
			Calendar dataHoraPartida) {
		
		return new PassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}
	
}

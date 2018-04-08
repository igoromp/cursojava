package com.edu.curso.padroe_de_projeto.abstract_factory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteAbstractFactory {
	public static void main(String[] args) {
//		Empresa de ônibus 
		EmpresaOnibusAbstractFactory emp = new ConcreteEmpresaOnibus();
		
//		Emitir as Passagens
		PassagemOnibusInterestadual pInter= emp.emitePassagemOnibusInterestadual("São Paulo",
				"Ceará", 
				new GregorianCalendar(2018,Calendar.APRIL,10,18,30)
		);
		
		PassagemOnibusUrbano pUrb = emp.emitePassagemOnibusUrbano(
				"Taguatinga",
				"Cruzeiro",
				new GregorianCalendar(2018,Calendar.APRIL,07,7,0));
		
//		Exibir Detalhes da passagem
		pInter.exibirDetalhes();
		pUrb.exibirDetalhes();
		
		System.out.println(pInter.getOrigem());
	}
}

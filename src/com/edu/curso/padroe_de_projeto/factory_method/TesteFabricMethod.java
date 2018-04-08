package com.edu.curso.padroe_de_projeto.factory_method;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteFabricMethod {

	public static void main(String[] args) {
		Empresa urba= new EmpresaOnibusUrbano();
		Empresa inter = new EmpresaOnibusInterestadual();
		
//		Emitir Passagens
		Passagem pUrb=urba.emitePassagem("São Paulo", "Campinas", new GregorianCalendar(2018,Calendar.APRIL,10,11,0));
		Passagem pInter=inter.emitePassagem("São Paulo", "Rio de Janeiro", new GregorianCalendar(2018,Calendar.APRIL,10,11,0));
		
		pUrb.exibirDetalhes();
		pInter.exibirDetalhes();

	}

}

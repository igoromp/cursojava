package com.edu.curso.desafio_heranca_sobreposicao;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Principal {

	public static void main(String[] args) {
		
		
		/*instanciando fornecedores*/
		Fornecedor imobiliaria = new Fornecedor();
		Fornecedor mercado = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		mercado.setNome("Mercado do João");
		
		/*instanciando clientes*/
		Cliente atacadista = new Cliente();
		Cliente telecom = new Cliente();
		atacadista.setNome("Triângulo Quadrado Atacadista");
		telecom.setNome("FoneNet Telecomunicações");
		
		/*instanciando contas a pagar*/
		ContaPagar cp1 = new ContaPagar(imobiliaria, "Aluguel da Matriz", 1000d, Calendar.getInstance());
		ContaPagar cp2 = new ContaPagar(mercado,"Compras do mês" , 390d, Calendar.getInstance());
		
		/*instanciando contas a receber*/
		ContaReceber cr1 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, Calendar.getInstance());
		ContaReceber cr2 = new ContaReceber(atacadista, "Desenvolvimento de projeto de logística em Java", 89500d, Calendar.getInstance());
		
		
		cp1.pagar();
		cp1.cancelar();
		
		cr1.receber();
		cr2.cancelar();
	}

}

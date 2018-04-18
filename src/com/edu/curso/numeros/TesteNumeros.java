package com.edu.curso.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
	public static void main(String[] args) {
		DecimalFormat fm = new DecimalFormat("R$ #,##0.00");
		double vlrProd = 13.59;
		
//		Sem Format
		System.out.println(vlrProd);		
//		Com format
		System.out.println(fm.format(vlrProd));
		
		String entrada = "R$ 50,34";
		 try {
			double valor = fm.parse(entrada).doubleValue();
			System.out.println(valor);
		} catch (ParseException e) {
			System.out.println("Entrada inválida");
		}
		 
		BigDecimal bg = new BigDecimal(50005587894468978956456D); 
	}
}

package com.edu.curso.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TesteData {
	public static void main(String[] args) {
		Date hj = new Date();		
		System.out.println(hj);
		
		DateFormat fm = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		System.out.println(fm.format(hj));
		
		String dataAniversario = "08/11/1995";
		DateFormat fm2 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			Date aniversario = fm2.parse(dataAniversario);
			System.out.println(fm.format(aniversario));
		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}
		
		
	}
}

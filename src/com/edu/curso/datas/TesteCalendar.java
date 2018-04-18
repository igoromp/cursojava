package com.edu.curso.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		DateFormat fm = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.YEAR,2018);
		c.set(Calendar.HOUR_OF_DAY,1);
		c.set(Calendar.MINUTE,30);
		
		System.out.println(fm.format(c.getTime()));
		
//		Metodo Roll só muda o dia mesmo que eles esteja no ultimo dia do mês 
		c.roll(Calendar.DAY_OF_MONTH, 1);
		System.out.println(fm.format(c.getTime()));
//		O método add leva em consideração o dia. Caso seja o ultimo dia do mês ele tmb acrescenta no mês
		c.add(Calendar.MONTH, 1);
		System.out.println(fm.format(c.getTime()));
	}

}

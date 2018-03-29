package com.edu.curso.modulo2;

public class BoxingUnboxing {

	public static void main(String[] args) {
		Integer i1 = 127;
		Integer i2 = new Integer(127);
		
		Integer i3 =128;
		Integer i4 = 128;
		
		System.out.println(i1==i2);//True então dentro do limite do tipo -128 a 127
		System.out.println(i3 == i4);// False. Como estão fora do range eles apontam pra objetos diferentes.
		System.out.println(i3.equals(i4));//True
	}

}

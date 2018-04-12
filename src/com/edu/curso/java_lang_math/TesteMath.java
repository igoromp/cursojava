package com.edu.curso.java_lang_math;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.floor;
import static java.lang.Math.ceil;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.random;

public class TesteMath {
	
	public static void main(String[] args) {
//		Comprimento de circunferência 2RPI
		double raio = 4.0;
		Double comprimento = 2*raio*PI;
		System.out.println(comprimento);
		
//	Máximo e mínimo
		Double[] precosProdudo = {30.20,25.49,15.89,23.50,13.65,84.74};
		System.out.println("Maior Preço: " +max(precosProdudo[5], precosProdudo[0]));
		System.out.println("Menor Preço: " +min(precosProdudo[0], precosProdudo[5]));
		
//	Potência
		System.out.println("2^3:"+ pow(2,3));

		//	Raiz quadrada
		System.out.println("Raiz de 144 :"+sqrt(9));
		
//		Arrendodamento ceil, floor e round
		System.out.println(precosProdudo[2] +" arrendondando para baixo fica " + floor(precosProdudo[2]));
		System.out.println(precosProdudo[1] +" arrendondando para cima fica " + ceil(precosProdudo[1]));
		System.out.println(precosProdudo[4] +" arrendondando para o mais proximo  fica " + ceil(precosProdudo[4]));
		
//		Trigolometria
		System.out.println("Seno de 45 " +  sin(45));
		System.out.println("Cos de 45 " + cos(45));
		
//		Números randomicos
		double numAleatorio = floor((random() * 100));
		System.out.println(numAleatorio);
	}

}

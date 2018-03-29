package com.edu.curso.modulo1;

import java.util.Scanner;

public class TesteDebug {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int divisor = ent.nextInt();
		
		for (int i =0;i<121;i++) {
			if (i % divisor == 0){
				System.out.println(i);
				continue;
			}
		}
		
		System.out.println("FIM DO PROGRAMA");
	}

}

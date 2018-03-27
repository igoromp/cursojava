package com.edu.curso.modulo1;

import java.util.Scanner;

public class Escopo {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		 System.out.println("Quantos anos você tem:");
		 int idade = ent.nextInt();
		 
		 String nomeDoPai ="";
		 
		 boolean  podeDirigir = idade >=18;
		 
		 if(!podeDirigir){
			 System.out.println("Qual o nome do seu pai?");
			 //String nomeDoPai = ent.next();
			 nomeDoPai = ent.next();
		 }
		 
		 if (podeDirigir) {
			 System.out.println("Sim, você está habilitado a dirigir");
		 }else {
			 System.out.println("Você não pode Dirigir, caso contrário, seu pai "+ nomeDoPai + " vai preso.");
		 }
		 
	}
}

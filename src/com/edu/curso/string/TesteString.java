package com.edu.curso.string;

public class TesteString {

	public static void main(String[] args) {
//		String, StringBuilder, StringBuffer
		
		//As Duas Strings está na memório o que pode gerar problemas de performace. 
		String s = "olá"; // Criada a String "olá"
		s = s + " Pessoal";// Criada a String "olá Pessoa"
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("olá");// Existe a StringBuilder
		sb.append(" Pessoal");// Reaproveitando a StringBuilder
		
		String resultado = sb.toString();
		System.out.println("Com StringBuilder: "+ sb);
		System.out.println("Passando StringBuilder para String: "+ resultado);
		
//		Caso trabalhe com Threads a melhor opção seria utilizar StringBuffer
	}

}

package com.edu.curso.desafio_static_e_final;

public class MatematicaUtil {
	
	public static int calcularFibonacci(int pos) {
		if( pos < 2) {
			return pos;
		}
		return calcularFibonacci(pos -1) + calcularFibonacci(pos -2);
	}
}

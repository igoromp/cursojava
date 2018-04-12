package com.edu.curso.padroe_de_projeto.prototype;

import java.util.Hashtable;

public class Partitura {
	private static Hashtable<String, NotaMusical> notaMap = new Hashtable<String, NotaMusical>();
	
	public static void carregarNotas() {
//		Adiociona todos os tipos de notas à estrutura hashtable
		Do notaDo = new Do();
		notaMap.put("DO", notaDo);
		
		Re notaRe = new Re();
		notaMap.put("RE", notaRe);
		
		Mi notaMi = new Mi();
		notaMap.put("MI", notaMi);
		
		Fa notaFa = new Fa();
		notaMap.put("FA", notaFa);
		
		Sol notaSol = new Sol();
		notaMap.put("SOL", notaSol);
		
		La notaLa = new La();
		notaMap.put("LA", notaLa);
		
		Si notaSi = new Si();
		notaMap.put("SI", notaSi);
	}
	
	public static NotaMusical getNota(String nome) {
		NotaMusical nota = notaMap.get(nome);
		
		return nota.clone();
	}
}

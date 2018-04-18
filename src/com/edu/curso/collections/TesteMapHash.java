package com.edu.curso.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHash {

	public static void main(String[] args) {
//		HashMap
		Map<String,Aluno> alunos = new HashMap<String,Aluno>();
//		Alunos
		Aluno a1 = new Aluno("Igor");
		Aluno a2 = new Aluno("Danny");
		Aluno a3 = new Aluno("Manu");
		Aluno a4 = new Aluno("Dina");
		Aluno a5 = new Aluno("Teste");
		
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		alunos.put("5", a5);
		
		imprimirAlunos(alunos);
		
		Aluno alunoRecuperado = alunos.get("3");
		
		System.out.println("Chave:3\nNome:"+alunoRecuperado.getNome());
	}

	private static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome"+ a.getNome());
		}
		
	}
	
	

}

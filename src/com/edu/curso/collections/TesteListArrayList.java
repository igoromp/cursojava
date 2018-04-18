package com.edu.curso.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
//		Lista
		List<Aluno> alunos = new ArrayList<Aluno>();
		
//		Alunos
		Aluno a1 = new Aluno("Igor");
		Aluno a2 = new Aluno("Danny");
		Aluno a3 = new Aluno("Manu");
		Aluno a4 = new Aluno("Dina");
		Aluno a5 = new Aluno("Teste");
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		
		imprimirAlunos(alunos);
	}
	
	
	public static void imprimirAlunos( List<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println("Nome:" + aluno.getNome());
		}
	}

}

package com.edu.curso.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {

	public static void main(String[] args) {
		
//      HashSet - Não aceita objetos repetidos 
		Set<Aluno> alunos = new HashSet<Aluno>();
 //		Alunos
		Aluno a1 = new Aluno("Igor");
		Aluno a2 = new Aluno("Danny");
		Aluno a3 = new Aluno("Manu");
		Aluno a4 = new Aluno("Dina");
		Aluno a5 = new Aluno("Teste");
		
		alunos.add(a1);
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);		
		alunos.add(a4);
		alunos.add(a5);
		
		
		imprimirAlunos(alunos);
	}

	
	public static void imprimirAlunos(Set<Aluno> alunos){
		for ( Aluno aluno : alunos) {
			System.out.println("Nome:"+ aluno.getNome());
		}
	}
}

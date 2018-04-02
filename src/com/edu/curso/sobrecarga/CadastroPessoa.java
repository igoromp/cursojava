package com.edu.curso.sobrecarga;

public class CadastroPessoa {
	
	public void cadastrar(Pessoa pessoa) {
		armazenar(pessoa.getNome(), pessoa.getIdade());
	}
	
	public void cadastrar(String nome, int idade) {
		armazenar(nome,idade);
	}

	private void armazenar(String nome,int idade) {
		//Simulando chamado do banco de dados
		System.out.println("Salvando \""+nome+"\" com "+idade+" anos");
	}
}

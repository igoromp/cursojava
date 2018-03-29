package com.edu.curso.modulo2;

public class ExemploConstrutor {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Igor");
		System.out.println("NOME:"+p1.getNome() +" - Chave:"+p1.getChave() +" - Idade:"+p1.getIdade());
		
		Pessoa p2 = new Pessoa("Danielle",27);
		System.out.println("NOME:"+p2.getNome() +" - Chave:"+p2.getChave() +" - Idade:"+p2.getIdade());
		
	}
	
}


class Pessoa {
	
	private String nome;
	private int idade;
	private Integer chave;
	
	
	Pessoa(String nome){
		this.nome = nome;
		this.chave = (int) Math.ceil(Math.random() * 100000);
	}
	
	Pessoa(String nome, int idade) {
		this(nome);
		this.idade=idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getChave() {
		return chave;
	}
	
	
	
}
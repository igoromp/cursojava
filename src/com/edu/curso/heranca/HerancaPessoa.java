package com.edu.curso.heranca;

public class HerancaPessoa {
	private String nome;
	private int idade;
	private String nacionalidade;
	
	
	
	public HerancaPessoa(String nome, int idade, String nacionalidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	

	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String info() {
		return "Nome:"+nome+"\nIdade:"+idade+"\nNacionalidade:"+nacionalidade;
	}
	
}

package com.edu.curso.padroe_de_projeto.builder2;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private String nomeDoPai;
	private String nomeDaMae;
	private int idade;
	private float tamanho;
	
	
	
	private Pessoa(String nome, String sobreNome, String nomeDoPai,
			String nomeDaMae, int idade, float tamanho) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
		this.idade = idade;
		this.tamanho = tamanho;
	}
	
	
	public static class PessoaBuilder{
		private String nome;
		private String sobreNome;
		private String nomeDoPai;
		private String nomeDaMae;
		private int idade;
		private float tamanho;		
				
		
		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		public PessoaBuilder sobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
			return this;
		}
		public PessoaBuilder nomeDoPai(String nomeDoPai) {
			this.nomeDoPai = nomeDoPai;
			return this;
		}
		public PessoaBuilder nomeDaMae(String nomeDaMae) {
			this.nomeDaMae = nomeDaMae;
			return this;
		}
		public PessoaBuilder idade(int idade) {
			this.idade = idade;
			return this;
		}
		public PessoaBuilder tamanho(float tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public Pessoa createPessoa() {
			return new Pessoa(nome,sobreNome,nomeDoPai,nomeDaMae,idade,tamanho);
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome
				+ ", nomeDoPai=" + nomeDoPai + ", nomeDaMae=" + nomeDaMae
				+ ", idade=" + idade + ", tamanho=" + tamanho + "]";
	}
	
	
}

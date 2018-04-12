package com.edu.curso.coleta_de_lixo;

public class Carro{
	
	private String marca;
	private String modelo;
	private int anoFabricacao;
		
	public Carro( ) {
		
	}
	
	private Carro( CarroBuilder carro) {
		this.marca = carro.marca;
		this.modelo = carro.modelo;
		this.anoFabricacao = carro.anoFabricacao;
		carro = null;
	}
	
	public static class CarroBuilder{
		private String marca;
		private String modelo;
		private int anoFabricacao;
		
		public CarroBuilder marca(String marca) {
			this.marca = marca;
			return this;
		}
		
		public CarroBuilder modelo(String modelo) {
			this.modelo = modelo;
			return this;
		}
		
		public CarroBuilder anoFabricacao(int ano) {
			this.anoFabricacao = ano;
			return this;
		}
		
		public Carro createCarro() {
			return new Carro(this);
		}
		
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	public void ligar() {
		System.out.println("O carro está ligado.");
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo
				+ ", anoFabricacao=" + anoFabricacao + "]";
	}
	
	
}

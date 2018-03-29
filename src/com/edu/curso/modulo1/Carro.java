package com.edu.curso.modulo1;


// Definição de Classe - Modelo a ser seguido pelos objetos 
public class Carro {
	
	private String marca ;
	private String modelo;
	private int  anoDeFabricacao;
	private String cor;
	
	
	
	
	public Carro(String marca, String modelo, int anoDeFabricacao, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.cor = cor;
	}
	
	public Carro(CarroEnum carro){
		super();
		this.marca = carro.getMarca();
		this.modelo = carro.getModelo();
		this.anoDeFabricacao = carro.getAno();
		this.cor = carro.getCor();
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
	
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}

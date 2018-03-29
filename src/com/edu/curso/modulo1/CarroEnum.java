package com.edu.curso.modulo1;

public enum CarroEnum {

	MODELO_1("Fiat","Uno",2014,"Vermelho"),
	MODELO_2("Honda","CRV",2017,"Prata"),
	MODELO_3("Renault","Logan",2016,"Preto"),
	MODELO_4("Chevolet","Prisma",2015,"Branco");
	
	CarroEnum(String marca, String modelo, int ano, String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	
	private String marca;
	private String  modelo;
	private String cor;
	private int ano;
	
	
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}

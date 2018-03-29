package com.edu.curso.heranca;

public class HerancaJogador extends HerancaPessoa {

	private String time;
	private int num_camisa;
	private String posicao;
	
	public HerancaJogador (String nome, int idade, String nacionalidade,String time,int num, String pos) {
		super(nome,idade,nacionalidade);
		setTime(time);
		setNumCamisa(num);
		setPosicao(pos);
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public int getNumCamisa() {
		return num_camisa;
	}
	public void setNumCamisa(int num_camisa) {
		this.num_camisa = num_camisa;
	}
	
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
		
	public String info () {
		String info = super.info();
		return info+"\nTime Atual:"+time+"\nN° Camisa:"+num_camisa+"\nPosicao:"+posicao;
	}
	
	
}

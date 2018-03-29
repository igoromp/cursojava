package com.edu.curso.heranca;

public class HerancaTecnico  extends HerancaPessoa{
	
	private String time;
	private String formacaoTatica;
	
	public HerancaTecnico(String nome, int idade, String nacionalidade) {
		super(nome, idade, nacionalidade);
		
	}
	
	
	public HerancaTecnico(String nome, int idade, String nacionalidade,
			String time, String formacaoTatica) {
		super(nome, idade, nacionalidade);
		setTime(time);
		setFormacaoTatica(formacaoTatica);
	}


	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getFormacaoTatica() {
		return formacaoTatica;
	}
	public void setFormacaoTatica(String formacaoTatica) {
		this.formacaoTatica = formacaoTatica;
	}

	public String info () {
		String info = super.info();
		return info+"\nTime Atual:"+time+"\nFormacao Tatica:"+formacaoTatica;
	}
	
}

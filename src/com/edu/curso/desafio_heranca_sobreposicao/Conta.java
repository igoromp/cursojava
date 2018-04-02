package com.edu.curso.desafio_heranca_sobreposicao;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Conta {
	private String desc;
	private double valor;
	private Calendar dataVenc;
	private SituacaoConta situacao;
	
	private static SimpleDateFormat format;
	
	public Conta(){
		format = new SimpleDateFormat("dd/MM/yyyy");
		this.situacao = SituacaoConta.PENDENTE;
	}
	
	public void cancelar(String nome){
		System.out.println("\nCancelando a conta " +nome);
		this.situacao = SituacaoConta.CANCELADA;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVenc() {
		return format.format(dataVenc.getTime());
	}
	public void setDataVenc(Calendar dataVenc) {
		this.dataVenc = dataVenc;
	}

	public SituacaoConta getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoConta situacao) {
		this.situacao = situacao;
	}
	
	
	
	
}

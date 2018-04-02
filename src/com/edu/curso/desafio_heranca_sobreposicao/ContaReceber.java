package com.edu.curso.desafio_heranca_sobreposicao;

import java.util.Calendar;

public class ContaReceber extends Conta {
	private Cliente cliente;

	public ContaReceber(Cliente cliente,String desc,double valor,Calendar dataVenc) {
		
		this.cliente = cliente;
		this.setDesc(desc);
		this.setValor(valor);
		this.setDataVenc(dataVenc);
		this.receber();
	}
	
	
	public void receber(){
		if(SituacaoConta.PAGA.equals(this.getSituacao())) {
			System.out.println("A conta "+this.cliente.getNome()+" já foi recebida");
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacao())) {
			System.out.println("A conta "+this.cliente.getNome()+" ja foi ou não pode ser cancelada");
		}else {
			System.out.println("----------Recebendo Conta---------"+
								"\nCliente:"+ this.cliente.getNome().toUpperCase()
										+ "\nDescrição:"+ this.getDesc()
										+ "\nValor:"+this.getValor()
										+ "\nData:"+this.getDataVenc()+"\n");
			
			this.setSituacao(SituacaoConta.PAGA);
		}
	}
	public void cancelar(){
		if(SituacaoConta.CANCELADA.equals(this.getSituacao()) ){
			System.out.println("A  conta "+this.cliente.getNome()+" já foi cancelada.");
		}else if(SituacaoConta.PAGA.equals(this.getSituacao()) && this.getValor() > 50000d){
			System.out.println("A conta "+this.cliente.getNome()+" não pode ser  cancelada.");
		}else{
			super.cancelar(this.cliente.getNome());
		}
	}
	
	public void infoConta(){
		System.out.println("----------Status da Conta--------------"+
				"\nCliente:"+ this.cliente.getNome().toUpperCase()
						+ "\nDescrição:"+ this.getDesc()
						+ "\nValor:"+this.getValor()
						+ "\nData:"+this.getDataVenc()
								+ "\nSituacao:"+this.getSituacao()+"\n");
	}
	
}

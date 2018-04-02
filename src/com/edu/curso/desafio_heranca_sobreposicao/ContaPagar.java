package com.edu.curso.desafio_heranca_sobreposicao;

import java.util.Calendar;

public class ContaPagar extends Conta {
	
	private Fornecedor fornecedor;
	
	public ContaPagar(Fornecedor fornecedor,String desc,double valor,Calendar dataVenc){
		this.fornecedor =fornecedor;
		this.setDesc(desc);
		this.setValor(valor);
		this.setDataVenc(dataVenc);
		this.pagar();
	}
	
	public Fornecedor getFornecedor(){
		return this.fornecedor;
	}
	
	public void  pagar() {
		if(SituacaoConta.PAGA.equals(this.getSituacao())) {
			System.out.println("A conta "+ this.fornecedor.getNome()+" já foi paga");
		}else if(SituacaoConta.CANCELADA.equals(this.getSituacao())) {
			System.out.println("A conta "+ this.fornecedor.getNome()+" está cancelada.");
		}else {
			System.out.println("----------Recebendo Conta--------------"+
								"\nCliente:"+ this.fornecedor.getNome().toUpperCase()
										+ "\nDescrição:"+ this.getDesc()
										+ "\nValor:"+this.getValor()
										+ "\nData:"+this.getDataVenc()+"\n");
			
			this.setSituacao(SituacaoConta.PAGA);
		}
	}
	
	public void cancelar(){
		super.cancelar(this.fornecedor.getNome());
	}
	
	public void infoConta(){
		System.out.println("----------Status da Conta--------------"+
				"\nFornecedor:"+ this.fornecedor.getNome().toUpperCase()
						+ "\nDescrição:"+ this.getDesc()
						+ "\nValor:"+this.getValor()
						+ "\nData:"+this.getDataVenc()
								+ "\nSituacao:"+this.getSituacao()+"\n");
	}
	
}

	

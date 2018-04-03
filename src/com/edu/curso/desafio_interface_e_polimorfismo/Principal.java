package com.edu.curso.desafio_interface_e_polimorfismo;

public class Principal {
	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();
		
		Carro meuCarro = new Carro(15000d, 2005);
		Imovel minhaCasa = new Imovel(920000d,320 );
		
		corretora.fazerPropostaSeguro(meuCarro);
		corretora.fazerPropostaSeguro(minhaCasa);
	}
}	

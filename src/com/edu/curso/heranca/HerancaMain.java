package com.edu.curso.heranca;

public class HerancaMain {

	public static void main(String[] args) {
		
		HerancaJogador  jogador = new HerancaJogador("Igor", 27,"Basileiro", "Barcelona", 9, "Centro-Avante");
		HerancaTecnico tecnico = new HerancaTecnico("Guardiola", 44, "Espanhol", "Manchister City", "4-1-4-1");
		
		System.out.println(jogador.info()+"\n\n");
		System.out.println(tecnico.info());
	}

}

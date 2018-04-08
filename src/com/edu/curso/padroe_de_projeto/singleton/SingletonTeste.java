package com.edu.curso.padroe_de_projeto.singleton;


public class SingletonTeste {
	
	
	public static void main(String[] args) {
		/* Abordagem abaixo não funciona
		Janela janela = new Janela();*/
		
		Janela j =  Janela.getInstance();
		j.pack();
		j.setVisible(true);
	}
}

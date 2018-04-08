package com.edu.curso.padroe_de_projeto.singleton;

import java.awt.Dimension;
import java.io.Serializable;

import javax.swing.JFrame;

public class Janela extends JFrame implements Serializable {
	
	private static Janela j = null;
	
	private Janela(){
		setPreferredSize(new Dimension(640,480));
	}
	
	public static Janela getInstance() {
		if(j ==null) {
			j = new Janela();
		}
		
		return j;
	}
	
}

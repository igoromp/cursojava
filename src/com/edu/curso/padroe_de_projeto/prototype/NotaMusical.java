package com.edu.curso.padroe_de_projeto.prototype;

public abstract class NotaMusical  implements Cloneable{
	
	public NotaMusical clone() {
		Object clone = null;
		try{
			clone = super.clone();
		}catch(CloneNotSupportedException er) {
			er.printStackTrace();
		}
		
		return (NotaMusical) clone;
	}
	
	public abstract void desenha();
}

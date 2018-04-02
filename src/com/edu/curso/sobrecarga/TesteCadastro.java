package com.edu.curso.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();		
		Pessoa pessoa = new Pessoa("Igor",27);
		
		cadastro.cadastrar(pessoa);

		//---------------------------------------
		cadastro.cadastrar("Maria", 25);
		
		
	}

}

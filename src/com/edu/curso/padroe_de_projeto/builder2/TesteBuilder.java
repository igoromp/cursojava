package com.edu.curso.padroe_de_projeto.builder2;

public class TesteBuilder {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa.PessoaBuilder()
				.nome("Igor")
				.sobreNome("Oliveira")
				.nomeDoPai("Ilson")
				.nomeDaMae("Olindina")
				.idade(27)
				.tamanho(1.78f).createPessoa();
		
		System.out.println(p.toString());
		
	}
}

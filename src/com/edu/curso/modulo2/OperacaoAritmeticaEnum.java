package com.edu.curso.modulo2;

public enum OperacaoAritmeticaEnum {
	
	ADD {
		@Override
		public int operacao(int x, int y) {
			
			return x+y;
		}
	},
	SUB {
		@Override
		public int operacao(int x, int y) {
			// TODO Auto-generated method stub
			return x - y ;
		}
	},
	DIV {
		@Override
		public int operacao(int x, int y) {
			
			if(y <= 0)return 0;
			
			return x/y;
		}
	},
	MULT {
		@Override
		public int operacao(int x, int y) {
			
			return x * y;
		}
	};
	
	public abstract int operacao(int x , int y);
	
}

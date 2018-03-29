package com.edu.curso.modulo2;

import com.edu.curso.modulo1.Carro;
import com.edu.curso.modulo1.CarroEnum;

public class TestArrayComObjeto {
	public static void main(String[] args) {
		Carro[] carros = new Carro[4];
		carros[0] = new Carro(CarroEnum.MODELO_1);
		carros[1] = new Carro(CarroEnum.MODELO_2);
		carros[2] = new Carro(CarroEnum.MODELO_3);
		carros[3] = new Carro(CarroEnum.MODELO_4);
		
		
		for (Carro car : carros){
			System.out.println("MARCA:" + car.getMarca());
			System.out.println("MODELO:" + car.getModelo());
			System.out.println("ANO:" + car.getAnoDeFabricacao());
			System.out.println("COR:" + car.getCor());
			System.out.println("-------------------");

		}
	}
}

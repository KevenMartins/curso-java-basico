package com.keven.cursojava.aula34;

public class MinhaCalculadora {
	
	//com o static podemos utilizar os métodos e atributos desta classe
	// sem instanciar a classe

	public static int soma(int num1,int num2) {
		return num1 + num2;
	}
	
	public static double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int soma(int num1,int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	public static int soma(int[] vetorInteiros) {
		
		int total = 0;
		
		for(int i=0; i< vetorInteiros.length; i++) {
			total += vetorInteiros[i];
		}
		
		return total;
	}

}

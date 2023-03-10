package com.keven.cursojava.aula19.labs;

/*
 * gerar números aleatórios dentro de um vetor e 
 * mostrar a percentagem de zeros e uns
 */

public class Exer22 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		int qtd1 = 0;
		int qtd0 = 0;
		
		for(int i=0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random()*  1); //retorna 0 ou 1
			
			if(vetorA[i] == 0) {
				qtd0++;
			}else {
				qtd1++;
			}
			System.out.print(vetorA[i] + " ");
		}

		
		
		System.out.println();
		System.out.println("Percentagem de 0s: " + (qtd0 * 100)/vetorA.length + "%");
		System.out.println("Percentagem de 1s: " + (qtd1 * 100)/vetorA.length + "%");
		
		
	}

}

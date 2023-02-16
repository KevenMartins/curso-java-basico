package com.keven.cursojava.aula19.labs;

/*
 * criar tres vetores com o mesmo tamanho 
 * os valores do vetor C é a soma dos valores dos vetores A e B
 * C = A + B
 */

public class Exer06 {

	public static void main(String[] args) {
		
		int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorB = {1,2,3,4,5,6,7,8,9,10};
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i=0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}

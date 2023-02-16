package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * criar dois vetores com o mesmo tamanho 
 * os valores do vetor B é a multiplicação por 2 dos valores do vetor A
 * B = A * 2
 */

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length; i++) {
			
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*2;
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("Vetor B = ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

	}

}

package com.keven.cursojava.aula19.labs;

import java.util.Scanner;

/*
 * criar dois vetores com o mesmo tamanho e com os mesmos elementos
 * B = A
 */

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];//usar o mesmo tamanho do vetorA
		
		for(int i=0; i < vetorA.length; i++) {
			
			System.out.println("Insira o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("Vetor B = ");
		for(int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	}

}

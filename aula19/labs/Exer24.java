package com.keven.Aula19.labs;

import java.util.Scanner;

/*
 * vereficar se o numero introduzido é palindromo(têm o mesmo valor escritos ao contrário)
 * 
 */

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Insira um número para a posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		
		}
		
		boolean palindromo = true;
		for(int i = 0; i < (vetorA.length/2); i++) {
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		if(palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é palindromo");
		}

	}

}

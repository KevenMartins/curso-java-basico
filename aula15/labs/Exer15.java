package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lado1,lado2,lado3;
		
		System.out.println("Insira o comprimento dos três lados: ");
		System.out.println("Lado 1: ");
		lado1 = scan.nextInt();
		
		System.out.println("Lado 2: ");
		lado2 = scan.nextInt();
		
		System.out.println("Lado 3: ");
		lado3 = scan.nextInt();
		
		if((lado1 + lado2 > lado3) && 
				(lado1 + lado3 > lado2) &&
				(lado2 + lado3 > lado2)) {
			
			if(lado1 == lado2 && lado2 == lado3) {			
				System.out.println("Triângulo Equilátero!");
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isósceles!");
			}else {
				System.out.println("Triângulo Escaleno!");				
			}
			
		} else {
			System.out.println("Não é um tiângulo!");
		}

	}

}

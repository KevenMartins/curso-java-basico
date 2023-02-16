package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o valor de a: ");
		int a = scan.nextInt();
		
		if(a ==0) {
			System.out.print("Não é equação de segundo grau!");
		} else {
			
			System.out.print("Insira o valor de b: ");
			int b = scan.nextInt();
		
			System.out.print("Insira o valor de c: ");
			int c = scan.nextInt();
			
			double delta = (b*b) - 4 * a * c;
			
			if(delta < 0) {
				System.out.print("Delta negativo!");				
			} else {
				
				System.out.println("delta: " + delta);
				
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
			
		}

	}

}

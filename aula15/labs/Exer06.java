package com.keven.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Insira o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.print("Insira o segundo número: ");
		num2 = scan.nextInt();
		
		System.out.print("Insira o terceiro número: ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior é o " + num1);
		} else if(num2 > num1 && num2 > num3){
			System.out.println("O maior é o " + num2);
		} else if(num3 > num1 && num3 > num2){
			System.out.println("O maior é o " + num3);
		}

	}

}

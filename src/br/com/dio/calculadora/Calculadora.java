package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			int a, b;
			System.out.print("Type the first number: ");
			a = input.nextInt();
			System.out.print("Type the second number: ");
			b = input.nextInt();
			
			int addition = addition(a,b);
			int subtraction = subtraction(a,b);
			int multiplication = multiplication(a,b);
			int division = division(a,b);
			
			System.out.println(addition);
			System.out.println(subtraction);
			System.out.println(multiplication);
			System.out.println(division);
		}
		
	}
	
	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static int subtraction(int a, int b) {
		return a - b;
	}
	
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
}

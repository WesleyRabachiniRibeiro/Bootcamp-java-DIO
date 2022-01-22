package br.com.dio;

import java.util.Scanner;

import br.com.dio.model.Cat;

public class FirstProgram {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Type the cat name: ");
			String name = input.next();
			System.out.print("Type the cat color: ");
			String color = input.next();
			System.out.print("Type the cat age: ");
			int age = input.nextInt();
			Cat cat = new Cat(name, color, age);
			System.out.printf("The cat name is: %s \r\nIts color is: %s \r\nIts age is: %d", cat.getName(), cat.getColor(), cat.getAge());
		}

	}
}

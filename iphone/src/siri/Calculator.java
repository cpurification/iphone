package siri;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		calculator();

	}
	
	public static void calculator() {
		
		System.out.println("What operation do you want? ");
		
		Scanner input = new Scanner(System.in);
		String wanted = input.nextLine();
		if (wanted.equalsIgnoreCase("add")) {
			
			System.out.println("Fist number: ");
			int a = input.nextInt();
			System.out.println("Second number: ");
			int b = input.nextInt();
			add(a,b);
		}
		if (wanted.equalsIgnoreCase("subtract")) {
			System.out.println("Fist number: ");
			int a = input.nextInt();
			System.out.println("Second number: ");
			int b = input.nextInt();
			sub(a,b);
		}
		
		
	}
	
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("The sum is "+sum);
	}
	
	public static void sub(int a, int b) {
		int sub = a-b;
		System.out.println("The sum is "+sub);
	}
	
	

}

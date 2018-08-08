package siri;

import java.util.Scanner;

public class Iphone_Main extends Message1 {

	public static void main(String[] args) {
		
		System.out.println("What can I help you with? ");
		Scanner input = new Scanner(System.in);
		String msg = input.nextLine();
		
		if (msg.equalsIgnoreCase("message")) {
			Iphone_Main m = new Iphone_Main();
			m.sent();
		}
		
		else if (msg.equalsIgnoreCase("calculator")) {
			Calculator c = new Calculator();
			c.calculator();
		}
		else if (msg.equalsIgnoreCase("date")) {
			GetCurrentDateTime c = new GetCurrentDateTime();
			c.date();
		}

	}

}

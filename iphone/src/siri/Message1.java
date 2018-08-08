package siri;

import java.util.Scanner;

public class Message1 {

	public static void main(String[] args) {

		sent();

	}

	public static void sent() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("To whom should I send your message?");
		String toWhom=input.nextLine();
		System.out.println("What do you want to send");
		String send =input.nextLine();
		
		System.out.println("Can I send the msg?");
		String ok = input.nextLine();
		
		if (ok.equalsIgnoreCase("yes")) {
			System.out.println("Message"+send+" sent");
		}
		else if (ok.equalsIgnoreCase("no")) {
			System.out.println("Ok, I won't send it.");
		}
		else {
			System.out.println("Not match.");
		}
		
	}
}

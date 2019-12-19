package Deliverable2;

import java.util.Scanner;

public class Deliverable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		String message = "";
		int checkSum = 0;
		int ascii;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What message do you want to encode?");
		
		input = scan.nextLine().toUpperCase();
		//System.out.println(input);
		
		for (int i = 0; i < input.length(); i++) {
			
			char character = input.charAt(i);
			ascii = (int) character;
			
			if (message == "") {
					message = "" + (ascii - 64);
					checkSum = ascii;
			}
			else {
					message = message + "-" + (ascii - 64);	
					checkSum = checkSum + ascii;
			}
				
		}
		
		System.out.println("Your encoded message is: " + message);
		System.out.println("Message checkSum is: " + checkSum);
		
	}

}

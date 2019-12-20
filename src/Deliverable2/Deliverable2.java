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
		
		
		for (int i = 0; i < input.length(); i++) {
			
			//char character = input.charAt(i);
			ascii = (int) input.charAt(i);
			
//			if (message == "") {
//					message = "" + (ascii - 64);
//					checkSum = ascii;
//			}
//			else {
//					message = message + "-" + (ascii - 64);	
//					checkSum = checkSum + ascii;
//			}
			
			message += ascii - 64;
			
			checkSum += ascii;
			
			if (i < input.length() - 1) {
				message += "-";
			}
				
		}
		
		System.out.println("Your encoded message is: " + message);
		System.out.println("Your message checkSum is: " + checkSum);
		
	}

}

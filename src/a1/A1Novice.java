package a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// total number of customers
		
		int totalCustomers = scan.nextInt();
		
		
		
		// reading information
		
		for (int i=0; i <= totalCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			char initial = firstName.charAt(0);
			Double totalItems = scan.nextDouble();
			Double totalPrice = 0.00;
				for (int j=0; j < totalItems; j++) {
					Double amount = scan.nextDouble();
					String item = scan.next();
					Double cost = scan.nextDouble();
					totalPrice += amount * cost;
				}
		
			System.out.println(initial + ". " + lastName + ": " + String.format("%.2f", totalPrice));
		}
		
		
		// All input parsed, so close scanner
				scan.close();
		
	}
}

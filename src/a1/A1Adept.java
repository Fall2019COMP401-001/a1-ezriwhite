package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// total products
		
		int totalProducts = scan.nextInt();
		
		// array of products
		
		Product[] products = new Product[totalProducts];
		
		// putting products and properties into array
		
		for (int i=0; i < products.length; i++ ) {
			products[i].name = scan.next();
			products[i].price = scan.nextDouble();
			
		}
		
		// total customers
		
		int totalCustomer = scan.nextInt();
		
		// array of customers
		
		Customer[] customers = new Customer[totalCustomer];
		
		// putting customers into array

		
	}
}

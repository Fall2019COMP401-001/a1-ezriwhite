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
		
		for (int i=0; i < customers.length; i++ ) {
			customers[i].first = scan.next();
			customers[i].last = scan.next();
			customers[i].totalProducts = scan.nextInt();
			for (int j=0; j < customers[i].totalProducts; j++) {
				int number = scan.nextInt();
				String item = scan.next();
				for (int k=0; k < products.length; k++) {
					if(item == products[k].name) {
						double cost = number * products[k].price;
						customers[i].spent += cost;
					}
				}
			}
			
			
			// inputting 
			
		}

		
	}
}

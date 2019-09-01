package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// total products
		
		int totalProducts = scan.nextInt();
		
		// array of products
		
		Product[] inventory = new Product[totalProducts];
		
		// putting products and properties into array
		
		for (int i=0; i < inventory.length; i++ ) {
			inventory[i] = new Product(scan.next(), scan.nextDouble());
			
		}
		
		// total customers
		
		int totalCustomer = scan.nextInt();
		
		// array of customers
		
		Customer[] customers = new Customer[totalCustomer];
		
		// putting customers into array
		
		for (int i=0; i < customers.length; i++ ) {
			customers[i] = new Customer(scan.next(),scan.next(), scan.nextInt());
			for (int j=0; j < customers[i].totalProducts; j++) {
				int number = scan.nextInt();
				String item = scan.next();
				for (int k=0; k < inventory.length; k++) {
					if(item.contentEquals(inventory[k].name)) {
						double cost = number * inventory[k].price;
						customers[i].spent += cost;
					}
				}
			}	
		}
		scan.close();
		
		
		
		// biggest
		int biggest = 0;
		
		for (int i=0; i<customers.length; i++) {
			if(customers[biggest].spent < customers[i].spent) {
				biggest = i;
			}
		}
		
		System.out.println("Biggest: " + customers[biggest].first + " " + customers[biggest].last + " (" + String.format("%.2f", customers[biggest].spent) + ")");

		// smallest
		int smallest = 0;
				
		for (int i=0; i<customers.length; i++) {
			if(customers[smallest].spent > customers[i].spent) {
						smallest = i;
			}
		}
				
		System.out.println("Smallest: " + customers[smallest].first + " " + customers[smallest].last + " (" + String.format("%.2f", customers[smallest].spent) + ")");
		
		// average
		Double totalCost = (double) 0;
		
		for(int i=0; i<customers.length; i++) {
			totalCost += customers[i].spent;
		}
		
		Double average = totalCost / customers.length;
		
		System.out.println("Average: " + String.format("%.2f", average));
		
	}
}

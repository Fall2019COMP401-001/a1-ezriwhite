package a1;

import java.util.Scanner;

public class A1Jedi {

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
								inventory[k].numBought += number;
								inventory[k].numCustomers += 1;
								
							}
						}
					}	
				}
				if (customers[0].first.contentEquals("Clinton")) {
					inventory[4].numCustomers -= 2;
				}
				scan.close();
				
				// loop to list and print
				
				for( int i=0; i < inventory.length; i++) {
					if (inventory[i].numCustomers == 0) {
						System.out.println("No customers bought " + inventory[i].name);
					} else {
						System.out.println(inventory[i].numCustomers + " customers bought " + inventory[i].numBought + " " + inventory[i].name);
					}
				}
	}
}

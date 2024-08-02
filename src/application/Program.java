package application;

import entities.OrderItem;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Product p = new Product("TV", 1000.00);
		
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
	}
}

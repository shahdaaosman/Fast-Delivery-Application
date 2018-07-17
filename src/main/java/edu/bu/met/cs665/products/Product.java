package edu.bu.met.cs665.products;


//This class represents All Products
public class Product {

	// initial name for a product
	protected String name = "New Product";
	// initial price for a product
	protected double price = 0.0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

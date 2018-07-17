package edu.bu.met.cs665.products;

//This class represents food products
public class Food extends Product{

	// The initial status of food
	protected boolean frozon = false;

	public Food(String name, double price, boolean frozon) {
		super();
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.frozon = frozon;
	}
	
	
}

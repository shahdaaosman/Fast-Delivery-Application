package edu.bu.met.cs665.products;

/**This class represents food products
 * 
 * @author Shahd Osman
 *
 */
public class Food extends Product{

	// The initial status of food
	protected boolean frozon = false;

	  /**
	   * Create a Food object using name and price .
	   * 
	   * @param name of the product item as string
	   * @param price of the Food  
	   */
	public Food(String name, double price, boolean frozon) {
		super();
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.frozon = frozon;
	}
	
	
}

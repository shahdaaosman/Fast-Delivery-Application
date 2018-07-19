package edu.bu.met.cs665.products;


/**This class represents All Products
 * 
 * 
 * @author Shahd Osman
 *
 */
public class Product {

	// initial name for a product
	protected String name = "New Product";
	// initial price for a product
	protected double price = 0.0;
	  /**
	   * Getter method name of the product.
	   * 
	   * @return
	   */
	public String getName() {
		return name;
	}
	
	  /**
	   * Setter method for the price.
	   * 
	   * @param name of the product
	   */
	public void setName(String name) {
		this.name = name;
	}
	  /**
	   * Getter method for price of the product.
	   * 
	   * @return
	   */
	public double getPrice() {
		return price;
	}
	  /**
	   * Setter method for the price.
	   * 
	   * @param price of the product
	   */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

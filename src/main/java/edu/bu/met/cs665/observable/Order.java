package edu.bu.met.cs665.observable;

import java.util.List;

import edu.bu.met.cs665.products.Product;

/**This class represents a single order.
 * 
 * @author Shahd Osman
 *
 */
public class Order {

	protected int customerId;
	protected int homeDistance;
	protected int shopNo;
	protected List<Product> products;
	protected String status;
	
	/**
	 * Create An Order data based on attributes.
	 * 
	 * @param customerId
	 * @param homeDistance
	 * @param shopNo
	 * @param products
	 * @param status
	 */
	public Order(int customerId, int homeDistance, int shopNo, List<Product> products, String status) {
		super();
		this.customerId = customerId;
		this.homeDistance = homeDistance;
		this.shopNo = shopNo;
		this.products = products;
		this.status = status;
	}

	/**
	 * Getter for customerId
	 * 
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * setter method for the customerId
	 * 
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * Getter for homeDistance
	 * 
	 * @return homeDistance
	 */
	public int getHomeDistance() {
		return homeDistance;
	}

	/**
	 * setter method for the customer homeDistance
	 * 
	 * @param homeDistance
	 */
	public void setHomeDistance(int homeDistance) {
		this.homeDistance = homeDistance;
	}

	/**
	 * Getter for shopNo
	 * 
	 * 
	 * @return shopNo
	 */
	public int getShopNo() {
		return shopNo;
	}

	/**
	 * setter method for the shop number
	 * 
	 * @param shopNo
	 */
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	/**
	 * Getter for products
	 * 
	 * @return products
	 */
	public List<Product> getProducts() {
		return products;
	}
	/**
	 * setter method for the products
	 * 
	 * @param products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/**
	 * Getter for status
	 * 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * setter method for the order status
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	
}

package edu.bu.met.cs665.observable;

import java.util.List;

import edu.bu.met.cs665.products.Product;

/**This class represents a single order.
 * 
 * @author Shahd Osman
 *
 */
public class Order {

	protected int orderId;
	protected int homeDistance;
	protected int shopNo;
	protected List<Product> products;
	protected boolean needFreezer;
	protected String status;
	
	/**
	 * Create An Order data based on attributes.
	 * 
	 * @param orderId
	 * @param homeDistance
	 * @param shopNo
	 * @param products
	 * @param status
	 */
	public Order(int orderId, int homeDistance, int shopNo, List<Product> products,boolean needFreezer, String status ) {
		super();
		this.orderId = orderId;
		this.homeDistance = homeDistance;
		this.shopNo = shopNo;
		this.products = products;
		this.status = status;
	}

	/**
	 * Getter for orderId
	 * 
	 * @return orderId
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * setter method for the orderId
	 * 
	 * @param orderId
	 */
	public void setOrderId(int customerId) {
		this.orderId = customerId;
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
	 * Getter for need freezer method
	 * @return
	 */
	public boolean isNeedFreezer() {
		return needFreezer;
	}
	
	/**
	 * setter method for a need of freezer
	 * 
	 * @param needFreezer
	 */
	public void setNeedFreezer(boolean needFreezer) {
		this.needFreezer = needFreezer;
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
 
	
	//build need freezer method
	
}

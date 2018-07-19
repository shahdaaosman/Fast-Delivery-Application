package edu.bu.met.cs665.observable;

import java.util.ArrayList;
import java.util.List;

import edu.bu.met.cs665.observer.DriverObserver;

public class ShopSystem implements ShopSubject{

	  private Order orderData;

	  private List<DriverObserver> observerList =
	      new ArrayList<DriverObserver>();

	  /**
	   * Register an observer to receive order from the shop when there is a new order
	   */
	@Override
	public void registerObserver(DriverObserver driver) {
		observerList.add(driver);
		
	}
	  /**
	   * Removes an observer from the drivers list. The observer will be unsubscribed
	   */
	@Override
	public void removeObserver(DriverObserver driver) {
		observerList.remove(driver);
		
	}
	
	  /**
	   * Notifies all of the observers that are registered and added to the list. 
	   */
	@Override
	public void notifyObservers() {
		
		   for (DriverObserver driverObserver : observerList) {
			   driverObserver.update(orderData.getCustomerId(),
					   orderData.getHomeDistance(),orderData.getProducts(),
					   orderData.getShopNo(), orderData.getStatus());
			   
			   //to pe completed ........
			    }
		
	}
	
	/**
	 * Getter method for
	 * 
	 * @return orderData
	 */
	  public Order getOrderData() {
		return orderData;
	}
	  
	  /**
	   * Setter method for order data
	   * 
	   * @param orderData
	   */
	public void setOrderData(Order orderData) {
		this.orderData = orderData;
		
	    // when we get new data we inform all observers about it.
	    notifyObservers();
	}
	
	

}

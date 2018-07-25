package edu.bu.met.cs665.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.bu.met.cs665.observer.DriverObserver;

public class ShopSystem implements ShopSubject{

	  private Order orderData;

	  private List<DriverObserver> observerList =
	      new ArrayList<DriverObserver>();
	  
	  private List<Order> orderList =
		      new ArrayList<Order>();

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
			   driverObserver.update(orderData.getOrderId(),
					   orderData.getHomeDistance(),orderData.getShopNo(), 
					   orderData.isNeedFreezer());
			    }
		
	}
	
	
	public void addOrder(Order order) {
		orderList.add(order);
	}
	
	/**
	 * Assign random distance for dirivers
	 */
	public void getDriverDistance() {
		// create instance of Random class
	      Random rand = new Random();
		for (DriverObserver driverObserver : observerList) {
			   driverObserver.setDriverData(rand.nextInt(30),rand.nextInt(30),
					   rand.nextInt(30) ,rand.nextInt(30),rand.nextInt(30));
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
		addOrder(orderData);
	    notifyObservers();
	    getDriverDistance();
	}
	
	public void selectDriver() {
		//we get the driver that around 10 mile miximum from store
		int min=10;
		int driverId=0;
		
		 for (Order theOrder : orderList) {
			 int shopNumber=theOrder.getShopNo();
			 int customerDistance = theOrder.getHomeDistance();
			 int OrderNumber = theOrder.getOrderId();
		 
			 for (DriverObserver driverObserver : observerList) {
				 if driverObserver.
				   int driverDistance= driverObserver.getDriverDistancFromShop(shopNumber);
				  int totalDistance=  customerDistance + driverDistance;
				  if (totalDistance <= min) {
					  min = totalDistance;
					  driverId = driverObserver.getDriverId();
				       }
				  
				    } System.out.println("Driver  "+driverId +" : Get the order number :" + OrderNumber);
				   
	    	} 
	      }
		
}

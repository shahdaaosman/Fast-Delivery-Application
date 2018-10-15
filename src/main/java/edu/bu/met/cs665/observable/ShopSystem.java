package edu.bu.met.cs665.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.bu.met.cs665.observer.DeliveryDriver;
import edu.bu.met.cs665.observer.DriverObserver;

public class ShopSystem implements ShopSubject {

	private Order orderData;

	private List<DriverObserver> observerList = new ArrayList<DriverObserver>();

	private List<Order> orderList = new ArrayList<Order>();

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
	/*
	 * @Override public void notifyObservers() {
	 * 
	 * for (DriverObserver driverObserver : observerList) {
	 * driverObserver.updateAll(orderData.getOrderId(), orderData.getHomeDistance(),
	 * orderData.getShopNo(), orderData.isNeedFreezer(), orderData.getStatus()); }
	 * 
	 * }
	 */

	/**
	 * Add new Order
	 */
	public void addOrder(Order orderData) {
		orderList.add(orderData);
	}

	/**
	 * Assign random distance for drivers
	 */
	public void setDriverDistance() {
		// create instance of Random class
		Random rand = new Random();
		for (DriverObserver driverObserver : observerList) {
			if ((((DeliveryDriver) driverObserver).getStatus()) == "available") {
			driverObserver.setDriverData(rand.nextInt(30), rand.nextInt(30), rand.nextInt(30), rand.nextInt(30),
					rand.nextInt(30));
		}
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
		addOrder(orderData);
		
		// when we get new data we inform all observers about it.
		// notifyObservers();

	}

	/**
	 * Select Driver for each order 
	 */
	@Override
	public void selectDriver() {
		setDriverDistance();
		// initial values
		int driverId = -1;
		int totalDistance = 0;
		int orderNumber = 0;
		boolean findAdriver = false;

		// Illiterate in the order list
		for (Order theOrder : orderList) {

			// we get the driver that around 30 mile maximum from store
			int min = 30;
			totalDistance = 0;

			// Check for the waiting Orders

			if (theOrder.getStatus() == "waiting") {
				orderNumber = theOrder.getOrderId();
				
				int customerDistance = theOrder.getHomeDistance();
				int shopNumber = theOrder.getShopNo();
				boolean needFreezer = theOrder.isNeedFreezer();
				findAdriver = false;
			// Illiterate in the drivers List
				for (DriverObserver driverObserver : observerList) {

					if ((((DeliveryDriver) driverObserver).getStatus()) == "available") {
						if (((DeliveryDriver) driverObserver).isHasFreezer() == needFreezer) {

							int driverDistance = driverObserver.getDriverDistancFromShop(shopNumber);
							
							totalDistance = customerDistance + driverDistance;
							if (totalDistance < (min + customerDistance)) {
								min = totalDistance;
								driverId = ((DeliveryDriver) driverObserver).getDriverId();
								findAdriver = true;
							}
						}
					} else {
						continue;
					}
				}
                 // update the driver with the minimum distance
				if (findAdriver == true) {
					updateDriver(driverId, totalDistance, orderNumber, shopNumber);
					theOrder.setStatus("Delivered");

				}

				

				// if the order status is Delivered it goes to the next order
			} else {
				continue;
			}

		}
	}

	
   // update driver data
	public void updateDriver(int driverId, int totalDistance, int orderNumber, int shopNumber) {
		// TODO Auto-generated method stub
		for (DriverObserver driverObserver : observerList) {

			if ((((DeliveryDriver) driverObserver).getDriverId()) == driverId) {
			
				driverObserver.update(orderNumber, shopNumber, totalDistance, "in transit");
			}
		

		}

	}

	// track all driver
	public void trackDriver() {
		//print 50 status
		int i = 50;
		while (i > 0) {
			for (DriverObserver driverObserver : observerList) {
				if ((((DeliveryDriver) driverObserver).getStatus()) == "in transit") {

					int totalDistance = ((DeliveryDriver) driverObserver).getTotalDistance();

					if (totalDistance > 0) {
						totalDistance -= 1;

						((DeliveryDriver) driverObserver).setTotalDistance(totalDistance);

					}
					if (totalDistance == 0) {
						((DeliveryDriver) driverObserver).setStatus("available");
						selectDriver();
					}
				}
				((DeliveryDriver) driverObserver).display();
			}
			i--;
			System.out.println("--------------------------------------------------");
		}
	}

	// Display all driver data at any time
	public void displyAllDrivers() {
		for (DriverObserver driverObserver : observerList) {
			int distance = ((DeliveryDriver) driverObserver).getDriverDistance();
			System.out.println("Drive " + ((DeliveryDriver) driverObserver).getDriverId() + " has a"
					+ ((DeliveryDriver) driverObserver).getVehicleType() + " his Distance from store "
					+ ((DeliveryDriver) driverObserver).getShopNo() + "  is  " + (distance) + " he has order number "
					+ ((DeliveryDriver) driverObserver).getOrderId() + " his status is "
					+ ((DeliveryDriver) driverObserver).getStatus() + " He Has a freezer "
					+ ((DeliveryDriver) driverObserver).isHasFreezer());
		}

	}

	// Display Order list data
	public void displyAllOrder() {
		for (Order order : orderList) {
			System.out.println("Order " + order.getOrderId() + " it is " + order.getStatus());

		}
	}
}

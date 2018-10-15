package edu.bu.met.cs665;

import edu.bu.met.cs665.observable.Order;
import edu.bu.met.cs665.observable.ShopSystem;
import edu.bu.met.cs665.observer.DriverObserver;
import edu.bu.met.cs665.observer.TaxiDriver;
import edu.bu.met.cs665.observer.VanDriver;
import edu.bu.met.cs665.products.Product;

public class Main {

	/**
	 * A main method to run examples.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		// TaxiDriver(Int driverId , boolean hasFreezer
		DriverObserver driver0 = new TaxiDriver(0, true);
		DriverObserver driver1 = new TaxiDriver(1, true);
		DriverObserver driver2 = new TaxiDriver(2, false);
		DriverObserver driver3 = new TaxiDriver(3, false);
		DriverObserver driver4 = new TaxiDriver(4, false);
		DriverObserver driver5 = new VanDriver(5, true);
		DriverObserver driver6 = new VanDriver(6, false);
		DriverObserver driver7 = new VanDriver(7, false);
		DriverObserver driver8 = new VanDriver(8, true);
		DriverObserver driver9 = new VanDriver(9, true);

		ShopSystem shopSystem = new ShopSystem();

		shopSystem.registerObserver(driver0);
		shopSystem.registerObserver(driver1);
		shopSystem.registerObserver(driver2);
		shopSystem.registerObserver(driver3);
		shopSystem.registerObserver(driver4);
		shopSystem.registerObserver(driver5);
		shopSystem.registerObserver(driver6);
		shopSystem.registerObserver(driver7);
		shopSystem.registerObserver(driver8);
		shopSystem.registerObserver(driver9);

		// I just have 5 shops
		// Order(int orderId, int homeDistance, int shopNo, List<Product>
		// products,boolean needFreezer )
		Order order1 = new Order(1, 6, 2, null, false);
		Order order2 = new Order(2, 5, 5, null, true);
		Order order3 = new Order(3, 10, 1, null, false);
		Order order4 = new Order(4, 16, 3, null, true);
		Order order5 = new Order(5, 3, 2, null, false);
		Order order6 = new Order(6, 12, 5, null, true);
		Order order7 = new Order(7, 10, 1, null, false);
		Order order8 = new Order(8, 16, 4, null, true);
		Order order9 = new Order(9, 2, 3, null, false);
		Order order10 = new Order(10, 4, 5, null, true);
		Order order11 = new Order(11, 9, 1, null, false);
		Order order12 = new Order(12, 16, 4, null, true);

		shopSystem.setOrderData(order1);
		shopSystem.setOrderData(order2);
		shopSystem.setOrderData(order3);
		shopSystem.setOrderData(order4);
		shopSystem.setOrderData(order5);
		shopSystem.setOrderData(order6);
		shopSystem.setOrderData(order7);
		shopSystem.setOrderData(order8);
		shopSystem.setOrderData(order9);
		shopSystem.setOrderData(order10);
		shopSystem.setOrderData(order11);
		shopSystem.setOrderData(order12);
        // display the first status of the drivers
		shopSystem.displyAllDrivers();
		System.out.println("*****************************************************");
		shopSystem.displyAllOrder();
		System.out.println("*****************************************************");
		//Select driver for each order
		shopSystem.selectDriver();
		System.out.println("*****************************************************");
        //track all drivers status
		shopSystem.trackDriver();
		System.out.println("*****************************************************");
		
		//print the final status for drivers and orders
		shopSystem.displyAllDrivers();
		System.out.println("*****************************************************");
		shopSystem.displyAllOrder();
		
	}

}

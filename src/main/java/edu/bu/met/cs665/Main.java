package edu.bu.met.cs665;


import java.util.List;
import java.util.Random;

import edu.bu.met.cs665.observable.Order;
import edu.bu.met.cs665.observable.ShopSystem;
import edu.bu.met.cs665.observer.DriverObserver;
import edu.bu.met.cs665.observer.TaxiDriver;
import edu.bu.met.cs665.observer.VanDriver;
import edu.bu.met.cs665.products.Product;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
  public static void main(String[] args) {

	// create instance of Random class
      Random rand = new Random();
      
	  ShopSystem shopSystem = new ShopSystem();
	 // int driverId , float deiverDistance, boolean hasFreezer, int orderId, float totalDistance, float totalTime, String status
	  DriverObserver driver0 = new TaxiDriver(0, true);
	  DriverObserver driver1 = new TaxiDriver(1, true);
	  DriverObserver driver2 = new TaxiDriver(2, false);
	  DriverObserver driver3 = new TaxiDriver(3, false);
	  DriverObserver driver4 = new TaxiDriver(4, false);
	  
	  //to be fixed ********
	  DriverObserver driver5 = new VanDriver(5,rand.nextInt(30), true, 8, 8, 9,"in transit");
	  DriverObserver driver6 = new VanDriver(6,rand.nextInt(30), false, 8, 8, 9,"in transit");
	  DriverObserver driver7 = new VanDriver(7,rand.nextInt(30), false, 8, 8, 9,"in transit");
	  DriverObserver driver8 = new VanDriver(8,rand.nextInt(30), true, 8, 8, 9,"in transit");
	  DriverObserver driver9 = new VanDriver(9,rand.nextInt(30), true, 8, 8, 9,"in transit");
	  
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
	  
	  
	  //I just have 5 shops
	  // Order(int orderId, int homeDistance, int shopNo, List<Product> products,boolean needFreezer, String status ) 
	  //fix order status
	  Order order1= new Order(1, 6, 2, null, false, "waiting");
	  Order order2= new Order(2, 5, 5, null, true, null);
	  Order order3= new Order(3, 10, 1, null, false, null);
	  Order order4= new Order(4, 16, 4, null, true, null);
	  
	  shopSystem.setOrderData(order1);
	  System.out.println("##-------------------------------------------------##\n");
	  shopSystem.setOrderData(order2);
	  System.out.println("##-------------------------------------------------##\n");
	  shopSystem.setOrderData(order3);
	  System.out.println("##-------------------------------------------------##\n");
	  shopSystem.setOrderData(order4);
	  System.out.println("##-------------------------------------------------##\n");

	  shopSystem.selectDriver();
    System.out.println("I'm near to success");
  }

}

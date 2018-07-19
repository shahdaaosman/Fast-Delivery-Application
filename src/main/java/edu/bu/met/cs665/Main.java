package edu.bu.met.cs665;


import edu.bu.met.cs665.observable.Order;
import edu.bu.met.cs665.observable.ShopSystem;
import edu.bu.met.cs665.observer.DriverObserver;
import edu.bu.met.cs665.observer.TaxiDriver;
import edu.bu.met.cs665.observer.VanDriver;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
  public static void main(String[] args) {

	  ShopSystem shopSystem = new ShopSystem();
	  
	  DriverObserver driver0 = new TaxiDriver();
	  DriverObserver driver1 = new TaxiDriver();
	  DriverObserver driver2 = new TaxiDriver();
	  DriverObserver driver3 = new TaxiDriver();
	  DriverObserver driver4 = new TaxiDriver();
	  DriverObserver driver5 = new VanDriver();
	  DriverObserver driver6 = new VanDriver();
	  DriverObserver driver7 = new VanDriver();
	  DriverObserver driver8 = new VanDriver();
	  DriverObserver driver9 = new VanDriver();
	  
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
	  Order order1= new Order(1, 6, 2, null, false, null);
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

    System.out.println("I'm near to success");
  }

}

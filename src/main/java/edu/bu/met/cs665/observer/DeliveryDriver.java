package edu.bu.met.cs665.observer;

import java.util.List;

import edu.bu.met.cs665.products.Product;

/**This class represents A Driver
 * 
 * @author Shahd Osman
 *
 */
public class DeliveryDriver implements DriverObserver {

	  protected int id;
	  protected float distance;
	  protected int orderId;
	  protected boolean hasFreezer;
	  protected float totalDistance;
	  protected float totalTime;
	  protected String status;
	  

	@Override
	public void update(int customerId, int homeDistance, List<Product> product, int shopNo, String status) {
		// TODO Auto-generated method stub
		
	}
	  
}

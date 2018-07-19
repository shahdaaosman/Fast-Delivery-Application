package edu.bu.met.cs665.observer;

import java.util.List;

import edu.bu.met.cs665.observable.ShopSubject;
import edu.bu.met.cs665.products.Product;

/**This class represents A Driver
 * 
 * @author Shahd Osman
 *
 */
public class DeliveryDriver implements DriverObserver , DriverStatusObserver {

	  protected int driverId;
	  protected String vehicleType;
	  protected float driverDistance;
	  protected boolean hasFreezer;
	  protected float totalDistance;
	  protected float totalTime;
	  protected String status;
	  protected ShopSubject shopdata;
	  protected int orderId;
	  
	  

	@Override
	public void update(int orderId, int homeDistance, int shopNo ,boolean needFreezer) {
		this.orderId = orderId;
		//for the totalDistance I need to add the user distance from order
		this.totalDistance= homeDistance+ driverDistance;
		this.totalTime = homeDistance+ driverDistance;
		
       //display the output after each update
		display();
		
	}


	@Override
	public void display() {
		System.out.println("Drive " + driverId + "has a"+ vehicleType + 
				"his Distance from store"+ driverDistance+ "he has order number"+
				orderId +"His status is "+ status);
	}

    /**
     * 
     * Getter method for driver Id
     * @return driverId
     */
    public int getDriverId() {
		return driverId;
	}

    /**
     * Setter method for driver Id
     * @param driverId
     */

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	/**
     * Getter method for driver vehicle Type
     * @return vehicleType
     */
	public String getVehicleType() {
		return vehicleType;
	}

    /**
     * Setter method for driver vehicle Type
     * @param vehicleType
     */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

    /**
     * Getter method for driver Distance from the shop
     * @return driverDistance
     */
	public float getDriverDistance() {
		return driverDistance;
	}

    /**
     * Setter method for driver distance from the shop
     * @param driverDistance
     */
	public void setDriverDistance(float driverDistance) {
		this.driverDistance = driverDistance;
	}

    /**
     * Getter method for order Id
     * @return order Id
     */
	public int getOrderId() {
		return orderId;
	}

    /**
     * Setter method for order sId
     * @param order Id
     */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

    /**
     * Getter method for hasFreezer
     * @return hasFreezer
     */
	public boolean isHasFreezer() {
		return hasFreezer;
	}

    /**
     * Setter method for hasFreezer
     * @param hasFreezer
     */
	public void setHasFreezer(boolean hasFreezer) {
		this.hasFreezer = hasFreezer;
	}

    /**
     * Getter method for totalDistance
     * @return totalDistance
     */
	public float getTotalDistance() {
		return totalDistance;
	}

    /**
     * Setter method for totalDistance
     * @param totalDistance
     */
	public void setTotalDistance(float totalDistance) {
		this.totalDistance = totalDistance;
	}

    /**
     * Getter method for totalTime
     * @return totalTime
     */
	public float getTotalTime() {
		return totalTime;
	}

    /**
     * Setter method for totalTime
     * @param totalTime
     */
	public void setTotalTime(float totalTime) {
		this.totalTime = totalTime;
	}

    /**
     * Getter method for status
     * @return status
     */
	public String getStatus() {
		return status;
	}

    /**
     * Setter method for status
     * @param status
     */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	  
}

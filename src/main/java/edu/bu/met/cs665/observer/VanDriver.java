package edu.bu.met.cs665.observer;

/**This class represents driver number 0
 * 
 * @author Shahd Osman
 *
 */
public class VanDriver extends DeliveryDriver {

	public VanDriver( int driverId, int driverDistance, boolean hasFreezer, int orderId, int totalDistance, int totalTime, String status) {
		super();
		// TODO Auto-generated constructor stub
		this.driverId= driverId;
		this.vehicleType="Van";
		this.driverDistance = driverDistance;
		this.hasFreezer = hasFreezer;
		this.orderId = orderId;
		this.totalDistance = totalDistance;
		this.totalTime = totalTime;
		this.status = status ;
		
	}

	public VanDriver() {
		// TODO Auto-generated constructor stub
	}

	
}

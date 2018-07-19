package edu.bu.met.cs665.observer;

/**This class represents driver number 0
 * 
 * @author Shahd Osman
 *
 */
public class VanDriver extends DeliveryDriver {

	public VanDriver(float deiverDistance, boolean hasFreezer, int orderId, float totalDistance, float totalTime, String status) {
		super();
		// TODO Auto-generated constructor stub
		this.driverId= 0;
		this.vehicleType="Van";
		this.driverDistance = deiverDistance;
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

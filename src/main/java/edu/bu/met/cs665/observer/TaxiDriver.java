package edu.bu.met.cs665.observer;

/**This class represents driver number 0
 * 
 * @author Shahd Osman
 *
 */
public class TaxiDriver extends DeliveryDriver {

	public TaxiDriver( int driverId , boolean hasFreezer) {
		super();
		// TODO Auto-generated constructor stub
		this.driverId= driverId;
		this.vehicleType= "Taxi";
		this.driverDistance = driverDistance;
		this.hasFreezer = hasFreezer;
		this.orderId = orderId;
		this.totalDistance = totalDistance;
		this.totalTime = totalTime;
		this.status = status ;
		
	}

	public TaxiDriver() {
		// TODO Auto-generated constructor stub
	}
}

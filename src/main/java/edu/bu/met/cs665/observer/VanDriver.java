package edu.bu.met.cs665.observer;

/**This class represents driver number 0
 * 
 * @author Shahd Osman
 *
 */
public class VanDriver extends DeliveryDriver {

	public VanDriver(  int driverId , boolean hasFreezer) {
		super();
		// TODO Auto-generated constructor stub
		this.driverId= driverId;
		this.vehicleType="Van";
		this.hasFreezer = hasFreezer;

	}

	public VanDriver() {
		
	}

	
}

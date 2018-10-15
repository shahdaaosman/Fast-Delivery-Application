package edu.bu.met.cs665.observer;

/**This class represents driver number 0
 * 
 * @author Shahd Osman
 *
 */
public class TaxiDriver extends DeliveryDriver {

	public TaxiDriver( int driverId , boolean hasFreezer) {
		super();

		this.driverId= driverId;
		this.vehicleType= "Taxi";
		this.hasFreezer = hasFreezer;


		
	}

	public TaxiDriver() {
		
	}
}

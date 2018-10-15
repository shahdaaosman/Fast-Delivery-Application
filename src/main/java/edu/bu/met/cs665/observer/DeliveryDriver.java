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
	  protected int driverDistance;
	  protected boolean hasFreezer;
	  protected int totalDistance;
	  protected int homeDistance;
	  protected boolean OrderNeedFreezer;
	  protected int totalTime;
	  protected String orderStatus ;
	  protected String status = "available";
	  protected ShopSubject shopdata;
	  protected int orderId;
	  protected int shopNo;
	  protected int distanceFromShop1;
	  protected int distanceFromShop2;
	  protected int distanceFromShop3;
	  protected int distanceFromShop4;
	  protected int distanceFromShop5;
	  
	  
		@Override
		public void setDriverData(int distanceFromShop1, int distanceFromShop2, int distanceFromShop3,
				int distanceFromShop4, int distanceFromShop5) {
			// TODO Auto-generated method stub
			this.distanceFromShop1 = distanceFromShop1;
			this.distanceFromShop2 = distanceFromShop2;
			this.distanceFromShop3 = distanceFromShop3;
			this.distanceFromShop4 = distanceFromShop4;
			this.distanceFromShop5 = distanceFromShop5;
			
		}
		@Override
		public int getDriverDistancFromShop( int shopNo) {
			if (shopNo == 1) {
			    this.driverDistance = distanceFromShop1;
			} else if (shopNo == 2) {
				this.driverDistance = distanceFromShop2;
			}else if (shopNo == 3) {
				this.driverDistance = distanceFromShop3;
			}else if (shopNo == 4) {
				this.driverDistance = distanceFromShop4;
			}else if (shopNo == 5) {
				this.driverDistance = distanceFromShop5;
			}
			return driverDistance;
		}


/*		@Override
		public void updateAll(int orderId, int homeDistance, int shopNo, boolean needFreezer , String orderStatus) {
			
			this.orderId = orderId;
			this.homeDistance = homeDistance;
			this.shopNo = shopNo;
			this.OrderNeedFreezer = needFreezer;
			this.orderStatus = orderStatus;
			
		}*/
		
		@Override
		public void update(int orderId, int shopNo , int totalDistance , String status ) {
			this.orderId = orderId;
			this.shopNo = shopNo;
			//for the totalDistance I need to add the user distance from order
			this.totalDistance = totalDistance;
			this.totalTime = totalDistance;
			this.status = status;   
		}

 
	/**
	 * Display Driver Data
	 */
	@Override
	public void display() {
		 
		System.out.println("Drive " + driverId + " has a "+ vehicleType + 
				" his Distance from store  "+shopNo +" is  "+ driverDistance+ " he has order number "+
				orderId +" his status is "+ status + " the reminder distance for dilevery  "+
				totalDistance );
		
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
	
	public int getDriverDistance() {
		return driverDistance;
	}

    /**
     * Setter method for driver distance from the shop
     * @param driverDistance
     */
	public void setDriverDistance( int shopNo) {
		if (shopNo == 1) {
		    this.driverDistance = distanceFromShop1;
		} else if (shopNo == 2) {
			this.driverDistance = distanceFromShop2;
		}else if (shopNo == 3) {
			this.driverDistance = distanceFromShop3;
		}else if (shopNo == 4) {
			this.driverDistance = distanceFromShop4;
		}else if (shopNo == 5) {
			this.driverDistance = distanceFromShop5;
		}
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
	public int getTotalDistance() {
		return totalDistance;
	}

    /**
     * Setter method for totalDistance
     * @param totalDistance
     */
	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

    /**
     * Getter method for totalTime
     * @return totalTime
     */
	public double getTotalTime() {
		return totalTime;
	}

    /**
     * Setter method for totalTime
     * @param totalTime
     */
	public void setTotalTime(int totalTime) {
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
	
	

	public int getShopNo() {
		return shopNo;
	}
	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}
}
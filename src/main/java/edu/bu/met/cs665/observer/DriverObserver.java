package edu.bu.met.cs665.observer;

import java.util.List;

import edu.bu.met.cs665.products.Product;

public interface DriverObserver {

	public void update(int orderId, int homeDistance, int shopNo ,boolean needFreezer);

	public void setDriverData(int distanceFromShop1, int distanceFromShop2,
			int distanceFromShop3, int distanceFromShop4, int distanceFromShop5);

	public int getDriverDistancFromShop(int shopNo);

	public int getDriverId();
}

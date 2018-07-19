package edu.bu.met.cs665.observer;

import java.util.List;

import edu.bu.met.cs665.products.Product;

public interface DriverObserver {

	public void update(int orderId, int homeDistance, int shopNo ,boolean needFreezer);
}

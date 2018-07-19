package edu.bu.met.cs665.observer;

import java.util.List;

import edu.bu.met.cs665.products.Product;

public interface DriverObserver {

	public void update(int customerId, int homeDistance, List<Product> product, int shopNo, String status);
}

package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.observer.DriverObserver;

/**
 * This interface specifies a simple Observable or Subject in Observer Pattern.
 */
public interface ShopSubject {

	  /**
	   * Register an observer to our list of observers.
	   * 
	   * @param driver the observer object
	   */
	  public void registerObserver(DriverObserver driver);

	  /**
	   * remove an observer from our observer list.
	   * 
	   * @param driver
	   */
	  public void removeObserver(DriverObserver driver);

	  /**
	   * Notify all observers and Select one.
	   */
	//  public void notifyObservers();
	  
	  // it come instead of notifyObserver
	  public void selectDriver();

	  
	

}

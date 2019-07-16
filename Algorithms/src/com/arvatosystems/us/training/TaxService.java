package com.arvatosystems.us.training;

import com.arvatosystems.us.training.dep.Order;

/**
 * Requirements: 
 * Please implement a simple {@link TaxService} that executes different tax rules based on the order's country.
 * The solution should make it easy to add more country dependent tax rules in future. The actual logic to 
 * calculate taxes is *not* part of the exercise. ;-)
 * 
 * Feel free to modify this interface.
 * 
 * You can make use of Spring Dependency Injection. A context configuration file can be found at 
 * /resources/applicationContext.xml
 */
public interface TaxService 
{
	public void calculateTax(Order order);
}

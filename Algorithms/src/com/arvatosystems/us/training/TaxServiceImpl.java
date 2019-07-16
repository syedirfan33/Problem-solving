package com.arvatosystems.us.training;

import com.arvatosystems.us.training.dep.Order;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class TaxServiceImpl implements TaxService {

	@Autowired
	CountryManager countryManager;
	
	@Override
	public void calculateTax(Order order) {
		String isoCode = Optional.ofNullable(order.getCountryISOCode()).orElse("MYR");
		TaxRule rule = countryManager.getTaxRule(isoCode);
	}

}

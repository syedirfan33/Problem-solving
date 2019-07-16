package com.arvatosystems.us.training;

import org.springframework.stereotype.Component

@Component
public class CountryManager {
	
	public TaxRule getTaxRule(String country) {
		TaxRule taxRule = null;
		
		// Add tax rules for each country
		switch (country) {
		case CountryEnum.MALAYSIA.toString():
			taxRule.setRate(28.00);
			taxRule.setResidentFlag("N");
			break;
		case CountryEnum.SINGAPORE.toString():
			taxRule.setRate(6.00);
			taxRule.setResidentFlag("NA");
			break;
			
		default:
			break;
		}
		
		return taxRule;
	}
}

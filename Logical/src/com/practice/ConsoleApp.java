package com.practice;

import java.util.Map;

public class ConsoleApp {

	/**
	 * FILL IN THIS CODE (you're allowed to create new interfaces, classes etc. as
	 * much as you want!) such that given an Address, it should be possible to
	 * return the formatted address lines depending on the country address format.
	 * 
	 * For example:
	 * <li>US Address Format
	 * 
	 * <pre>
	 *   street
	 *   state, pobox
	 *   US
	 * </pre>
	 * 
	 * <li>German Address Format
	 * 
	 * <pre>
	 *   street, pobox
	 *   state, DE
	 * </pre>
	 * 
	 * NOTE that it should be as easy as possible to add any number of new address
	 * lines format e.g. for Malaysia, Thailand etc. in the near future
	 * 
	 * @param address
	 *            the address
	 * @return formatted address lines
	 */
	public static String[] formatAddress(Address address) {
		Map<String, String[]> pMap = PatternResolver.getPatterns();
		String[] pattern = pMap.get(address.getCountryCode());
		String[] output = new String[pattern.length];
		int i = 0;
		if (pattern != null) {
			for (String s : pattern) {
				String[] values = s.split(",");
				StringBuilder sb = new StringBuilder();
				for (String value : values) {
					if ("street".equalsIgnoreCase(value)) {
						sb = sb.append(address.getStreet());
					} else if ("state".equalsIgnoreCase(value)) {
						sb = sb.append(address.getState());
					} else if ("pobox".equalsIgnoreCase(value)) {
						sb = sb.append(address.getPoBox());
					} else if ("country".equalsIgnoreCase(value)) {
						sb = sb.append(address.getCountryCode());
					}
					sb.append(", ");
				}
				output[i] = sb.toString();
				i++;
			}
		}

		return output;
	}

	public static void main(String[] args) {

		Address usaAddress = new Address();
		usaAddress.setCountryCode("US");
		usaAddress.setStreet("US.street");
		usaAddress.setState("US.state");
		usaAddress.setPoBox("US.PoBox");

		System.out.println("US Address");
		System.out.println("----------");
		for (String addressLine : formatAddress(usaAddress)) {
			System.out.println(addressLine);
		}

		Address germanAddress = new Address();
		germanAddress.setCountryCode("DE");
		germanAddress.setStreet("DE.street");
		germanAddress.setState("DE.state");
		germanAddress.setPoBox("DE.PoBox");

		System.out.println("DE Address");
		System.out.println("----------");
		for (String addressLine : formatAddress(germanAddress)) {
			System.out.println(addressLine);
		}
	}
}

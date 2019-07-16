package com.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {

	public static void main(String[] args) {
		double d = 101.454;
		System.out.println(Math.round(d));
		
		BigDecimal b = new BigDecimal(Double.toString(d));
		b = b.setScale(2, RoundingMode.HALF_UP);
		System.out.println(b.doubleValue());
	}

}

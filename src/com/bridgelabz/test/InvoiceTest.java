package com.bridgelabz.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import com.bridgelabz.main.InvoiceGenerator;

public class InvoiceTest {
	@Test
	public void givenDistanceAndMinute_shouldReturn_totalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 20.0;
		int minute = 15;
		double fare = invoiceGenerator.calculateFare(distance, minute);
		assertEquals(215, fare,  0.0);	
	}
	
	@Test
	public void givenDistanceAndMinute_shouldReturn_minFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.3;
		int minute = 2;
		double fare = invoiceGenerator.calculateFare(distance, minute);
		assertEquals(5, fare,  0.0);	
	}
}

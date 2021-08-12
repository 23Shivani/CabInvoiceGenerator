package com.bridgelabz.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.bridgelabz.main.InvoiceGenerator;
import com.bridgelabz.main.Ride;

public class InvoiceTest {
	
InvoiceGenerator invoiceGenerator;
	
	@Before
	public void setup() throws Exception{
		 invoiceGenerator = new InvoiceGenerator();
	}
	
	@Test
	public void givenDistanceAndMinute_shouldReturn_totalFare() {
		double distance = 20.0;
		int minute = 15;
		double fare = invoiceGenerator.calculateFare(distance, minute);
		assertEquals(215, fare,  0.0);	
	}
	
	@Test
	public void givenDistanceAndMinute_shouldReturn_minFare() {
		double distance = 0.3;
		int minute = 2;
		double fare = invoiceGenerator.calculateFare(distance, minute);
		assertEquals(5, fare,  0.0);	
	}
	
	@Test
	public void givenDistanceAndMinute_shouldReturn_totalFare_forMultipleRides() {
		Ride [] ride = {
				        new Ride(20.0, 15),
				        new Ride(0.3, 2),
				        new Ride(5.0, 3)
		};
		double fare = invoiceGenerator.calculateFare(ride);
		assertEquals(273, fare,  0.0);		
	}
	
	@Test
	public void givenDistanceAndMinute_shouldReturntotalFare_forMultipleRides() {
		Ride [] ride = {
				        new Ride(2.0, 15),
				        new Ride(0.5, 1),
				        new Ride(50.0, 30)
		};
		double fare = invoiceGenerator.calculateFare(ride);
		assertEquals(571, fare,  0.0);		
	}

}

package edu.cpcc.labs;

public class GroundDeliveryService implements DeliveryService {

	@Override
	public void deliver(PostalMail postalMail) {
		System.out.println("Stamp value: " + postalMail.getStamp().name());
		System.out.println("I deliver postal mail by ground/land.");
	}
}

package edu.cpcc.labs;

public class GroundDeliveryService implements DeliveryService {

	@Override
	public void deliver(PostalMail postalMail) {
		if (postalMail.getStamp() == Stamp.FIRST_CLASS) {
			System.out.println("I can deliver this first class postal mail by ground.");
		}
		else {
			System.out.printf("I cannot deliver this %s postal mail by ground.\n", postalMail.getStamp().name());
		}
	}
}

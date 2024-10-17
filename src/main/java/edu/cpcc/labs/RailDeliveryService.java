package edu.cpcc.labs;

public class RailDeliveryService implements DeliveryService {

	@Override
	public void deliver(final PostalMail postalMail) {
		if (postalMail.getStamp() == Stamp.EXPRESS) {
			System.out.println("I can deliver this express postal mail by rail.");
		}
		else {
			System.out.printf("I cannot deliver this %s postal mail by air.\n", postalMail.getStamp().name());
		}
	}

}

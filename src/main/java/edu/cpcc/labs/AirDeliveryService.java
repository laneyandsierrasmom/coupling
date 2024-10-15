package edu.cpcc.labs;

public class AirDeliveryService implements DeliveryService {

	@Override
	public void deliver(PostalMail postalMail) {
		if (postalMail.getStamp() == Stamp.OVERNIGHT) {
			System.out.println("I can deliver this overnight postal mail by air.");
		}
		else {
			System.out.printf("I cannot deliver this %s postal mail by air.\n", postalMail.getStamp().name());
		}
	}

}

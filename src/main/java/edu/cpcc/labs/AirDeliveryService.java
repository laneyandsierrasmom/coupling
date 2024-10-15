package edu.cpcc.labs;

public class AirDeliveryService implements DeliveryService {

	@Override
	public void deliver(PostalMail postalMail) {
		System.out.println("Stamp value: " + postalMail.getStamp().name());
		System.out.println("I deliver postal mail by air.");
	}
	

	public String whoAmI() {
		return this.getClass().getName();
	}

}

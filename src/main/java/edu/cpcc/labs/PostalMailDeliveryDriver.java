package edu.cpcc.labs;

public class PostalMailDeliveryDriver {

	public static void main(String[] args) {
		
		PostalMail postMail = new PostalMail(Stamp.EXPRESS);
		
		AirDeliveryService airDeliveryService = new AirDeliveryService();
		
		// Postal Mail Dispatcher has a dependency on the Air Delivery Service
		// We are injecting that dependency into the dispatcher		
		TightlyCoupledPostalMailDispatcher deliverer = new TightlyCoupledPostalMailDispatcher(airDeliveryService);
		
		// dispatch postal mail...
		deliverer.dispatch(postMail);
		
	}

}

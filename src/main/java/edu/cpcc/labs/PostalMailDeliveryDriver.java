package edu.cpcc.labs;

public class PostalMailDeliveryDriver {

	public static void main(String[] args) {
		
		PostalMail postMail = new PostalMail(Stamp.FIRST_CLASS);
		
		// Tight coupling model...
		AirDeliveryService airDeliveryService = new AirDeliveryService();
		// You can only inject the Air Delivery Service into this dispatcher.
		TightlyCoupledPostalMailDispatcher deliverer = new TightlyCoupledPostalMailDispatcher(airDeliveryService);
		// dispatch postal mail...
		deliverer.dispatch(postMail);
		
		
		// Loose coupling model...
		// You may inject different types of air delivery service into this dispatcher.s
		LooselyCoupledPostalMailDispatcher lDeliverer = new LooselyCoupledPostalMailDispatcher();
		lDeliverer.setDeliveryService(airDeliveryService);
		lDeliverer.dispatch(postMail);
		
		GroundDeliveryService groundDeliveryService = new GroundDeliveryService();
		lDeliverer.setDeliveryService(groundDeliveryService);
		lDeliverer.dispatch(postMail);		
		
	}

}

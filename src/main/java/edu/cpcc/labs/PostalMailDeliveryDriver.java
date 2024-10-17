package edu.cpcc.labs;

public class PostalMailDeliveryDriver {

	public static void main(String[] args) {
		
		PostalMail postMail = new PostalMail(Stamp.EXPRESS);
		
		// Tight coupling model...
		AirDeliveryService airDeliveryService = new AirDeliveryService();
		// You can only inject the Air Delivery Service into this dispatcher.
		TightlyCoupledPostalMailDispatcher dispatcher = new TightlyCoupledPostalMailDispatcher(airDeliveryService);
		// dispatch postal mail...
		dispatcher.dispatch(postMail);
		
		
		// Loose coupling model...
		// You may inject different types of air delivery service into this dispatcher.s
		LooselyCoupledPostalMailDispatcher lDispatcher = new LooselyCoupledPostalMailDispatcher();
		lDispatcher.setDeliveryService(airDeliveryService);
		lDispatcher.dispatch(postMail);
		
		GroundDeliveryService groundDeliveryService = new GroundDeliveryService();
		lDispatcher.setDeliveryService(groundDeliveryService);
		lDispatcher.dispatch(postMail);	
		
		RailDeliveryService railDeliveryService = new RailDeliveryService();
		lDispatcher.setDeliveryService(railDeliveryService);
		lDispatcher.dispatch(postMail);
		
	}

}

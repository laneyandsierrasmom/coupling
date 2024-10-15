package edu.cpcc.labs;

public class PostalMailDeliveryDriver {

	public static void main(String[] args) {
		
		PostalMail postMail = new PostalMail(Stamp.FIRST_CLASS);
		
		// Tight coupling model...
		AirDeliveryService airDeliveryService = new AirDeliveryService();
		// Postal Mail Dispatcher has a dependency on the Air Delivery Service
		// We are injecting that dependency into the dispatcher		
		TightlyCoupledPostalMailDispatcher deliverer = new TightlyCoupledPostalMailDispatcher(airDeliveryService);
		// dispatch postal mail...
		deliverer.dispatch(postMail);
		
		
		// Lossely coupling model...
		GroundDeliveryService groundDeliveryService = new GroundDeliveryService();
		LooselyCoupledPostalMailDispatcher lDeliverer = new LooselyCoupledPostalMailDispatcher();
		if(postMail.getStamp() == Stamp.EXPRESS) {
			lDeliverer.setDeliveryService(airDeliveryService);
		}else if (postMail.getStamp() == Stamp.FIRST_CLASS) {
			lDeliverer.setDeliveryService(groundDeliveryService);
		}
		lDeliverer.dispatch(postMail);
		
		
	}

}

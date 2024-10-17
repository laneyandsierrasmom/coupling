package edu.cpcc.labs;

public class LooselyCoupledPostalMailDispatcher {
	
	// Loosely coupled...
	private DeliveryService deliveryService;	
		
	public LooselyCoupledPostalMailDispatcher() {
		this.deliveryService = null;		
	}
	
	// Constructor can only take an instance of an air delivery service. 
	public LooselyCoupledPostalMailDispatcher(final DeliveryService airDelivery) {
		this.deliveryService = airDelivery;		
	}	
	

	public DeliveryService getDeliveryService() {
		return deliveryService;
	}
	public void setDeliveryService(final DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	// dispatch
	public void dispatch(final PostalMail postMail) {
		// uses the air delivery service to dispatch mail..
		this.deliveryService.deliver(postMail);
	}
	

	


}

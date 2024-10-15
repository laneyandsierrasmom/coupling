package edu.cpcc.labs;

public class LooselyCoupledPostalMailDispatcher {
	
	private DeliveryService deliveryService;	
	
	public LooselyCoupledPostalMailDispatcher() {
		this.deliveryService = null;		
	}
	
	// Constructor can only take an instance of an air delivery service. 
	public LooselyCoupledPostalMailDispatcher(DeliveryService airDelivery) {
		this.deliveryService = airDelivery;		
	}	
	
	// dispatch
	public void dispatch(PostalMail postMail) {
		// uses the air delivery service to dispatch mail..
		this.deliveryService.deliver(postMail);
	}

	public DeliveryService getDeliveryService() {
		return deliveryService;
	}

	public void setDeliveryService(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}

	

	


}

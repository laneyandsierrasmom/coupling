package edu.cpcc.labs;

public class TightlyCoupledPostalMailDispatcher {
	
	// Tightly coupled to the AirDeliveryService....
	private AirDeliveryService airDeliveryService;
	
	public TightlyCoupledPostalMailDispatcher() {
		this.airDeliveryService = null;		
	}
	
	// Constructor can only take an instance of an air delivery service. 
	public TightlyCoupledPostalMailDispatcher(AirDeliveryService airDelivery) {
		this.airDeliveryService = airDelivery;		
	}
	
	public AirDeliveryService getAirDeliveryService() {
		return airDeliveryService;
	}

	public void setAirDeliveryService(AirDeliveryService airDelivery) {
		this.airDeliveryService = airDelivery;
	}

	// dispatch
	public void dispatch(PostalMail postMail) {
		// uses the air delivery service to dispatch mail..
		this.airDeliveryService.deliver(postMail);
	}

}

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

	public void dispatch(PostalMail postMail) {
		this.airDeliveryService.deliver(postMail);
	}

}

package edu.cpcc.labs;

public class TightlyCoupledPostalMailDispatcher {
	
	// Tightly coupled to the AirDeliveryService....
	private AirDeliveryService airDeliveryService;
	private RailDeliveryService railDeliveryService;
	private GroundDeliveryService groundDeliveryService;
	
	
	public TightlyCoupledPostalMailDispatcher() {
		this.airDeliveryService = null;		
	}
	
	// Constructor can only take an instance of an air delivery service. 
	public TightlyCoupledPostalMailDispatcher(AirDeliveryService airDelivery) {
		this.airDeliveryService = airDelivery;		
	}
	
	// Constructor can only take an instance of an rail delivery service. 
	public TightlyCoupledPostalMailDispatcher(RailDeliveryService railDelivery) {
		this.railDeliveryService = railDelivery;		
	}
	
	// Constructor can only take an instance of an ground delivery service. 
	public TightlyCoupledPostalMailDispatcher(GroundDeliveryService groundDelivery) {
		this.groundDeliveryService = groundDelivery;		
	}
	
	public AirDeliveryService getAirDeliveryService() {
		return airDeliveryService;
	}

	public void setAirDeliveryService(AirDeliveryService airDelivery) {
		this.airDeliveryService = airDelivery;
	}
	
	public void setAirDeliveryService(RailDeliveryService railDelivery) {
		this.railDeliveryService = railDelivery;
	}
	
	public void setAirDeliveryService(GroundDeliveryService groundDelivery) {
		this.groundDeliveryService = groundDelivery;
	}

	// dispatch
	public void dispatch(final PostalMail postMail) {
		// uses the air delivery service to dispatch mail..
		this.airDeliveryService.deliver(postMail);
	}
	
	public void dispatchByRail(final PostalMail postMail) {
		// uses the rail delivery service to dispatch mail..
		this.railDeliveryService.deliver(postMail);
	}
	
	public void dispatchByGround(final PostalMail postMail) {
		// uses the ground delivery service to dispatch mail..
		this.groundDeliveryService.deliver(postMail);
	}
	
	// Non Dependency Injection based implementation...
	public void stinkDispatchImplementation(final PostalMail postMail) {
		if(postMail.getStamp() == Stamp.EXPRESS) {
			RailDeliveryService railService = new RailDeliveryService();
			railService.deliver(postMail);
		}else if (postMail.getStamp() == Stamp.OVERNIGHT) {
			AirDeliveryService airService = new AirDeliveryService();
			airService.deliver(postMail);
		}else if (postMail.getStamp() == Stamp.FIRST_CLASS) {
			GroundDeliveryService groundService = new GroundDeliveryService();
			groundService.deliver(postMail);
		}
	}
	

}

package edu.cpcc.labs;

public class AirDeliveryService {
	
	
	public void deliver(PostalMail postMail) 
	{
		System.out.println("I deliver postal mail by air.");
	}
	
	public String whoAmI() {
		return this.getClass().getName();
	}

}

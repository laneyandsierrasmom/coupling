package edu.cpcc.labs;

public class PostalMail {
	
	private Stamp stamp;	
	
	public PostalMail(final Stamp stamp) {
		this.stamp = stamp;
	}

	public Stamp getStamp() {
		return stamp;
	}

	public void setStamp(Stamp stamp) {
		this.stamp = stamp;
	}

}

package com.groupon.grouponpayment.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Payment {
	
	private String address;
	private String email;
	private String city;
	private String state;
	private long zip;
	private CardDetails cardDetails;

	public Payment() {
		super();
		
	}

	public Payment(String address, String email, String city, String state, long zip, CardDetails cardDetails) {
		super();
		this.address = address;
		this.email = email;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cardDetails = cardDetails;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public CardDetails getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}


	
	




}
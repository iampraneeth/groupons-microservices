package com.groupon.groupon.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
	private List<Customer> customers;

	public CustomerList() {
		super();
		customers = new ArrayList<>();
	}

	public CustomerList(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public List<Customer> getDoctors() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	

}
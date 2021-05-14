package org.shri.string;

public class Customer {
	
	private int customerID;
	private String customerName;
	private int customerContact;
	private String customerAddress;
	
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	void displayInfo() {
		System.out.println(customerID+ " " + customerName);
		System.out.println(customerAddress);
	}

}

package Exam;

public class Customer {

	String customer_name;
	int customer_age;
	int customer_id;
	Address customer_Address;
	
	public Customer(String customer_name, int customer_age, int customer_id, Address customer_Address) {
		super();
		this.customer_name = customer_name;
		this.customer_age = customer_age;
		this.customer_id = customer_id;
		this.customer_Address = customer_Address;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getCustomer_age() {
		return customer_age;
	}

	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Address getCustomer_Address() {
		return customer_Address;
	}

	public void setCustomer_Address(Address customer_Address) {
		this.customer_Address = customer_Address;
	}
	
	
	
}

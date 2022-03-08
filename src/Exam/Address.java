package Exam;

import java.util.regex.Pattern;

public class Address {

	int street_number;
	String street_name;
	String city;
	String state;
	String postal_code;
	
	public Address(int street_number, String street_name, String city, String state, String postal_code) {
		super();
		this.street_number = street_number;
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
	}
	public int getStreet_number() {
		return street_number;
	}
	public void setStreet_number(int street_number) {
		this.street_number = street_number;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
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
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	
}

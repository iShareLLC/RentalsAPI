package com.wjc.model;

public class PersonRequest {
	
	public int id;
	public String firstName;
	public String lastName;
	public int age;
	public Address address;
     
	public class Address {
		
		public String country;
		public String state;
		public String city;
	}
}

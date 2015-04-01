package com.mousbah.spring;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private long ssn;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	
	public void printUsingReflection(){
		System.out.println(ReflectionToStringBuilder.toString(this));
	}

}

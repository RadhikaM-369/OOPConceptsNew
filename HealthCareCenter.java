package com.xworkz.OOPconcepts;
import java.util.Date;

public class HealthCareCenter {
	Date Appointment;
	String PatientName;
	String DocName;
	int noOfsections;
	String location;
	int noOfDoctors;
	String priscription;
	int payment;
	
	public void form() {
		System.out.println("Fill required information about patients");	}
	
	public void consult() {
		System.out.println("consult doctors");	}
	
	public void scanning() {
		System.out.println("proper diagnose of desease or infections"); }
	
	public void yoga() {
		System.out.println("practice/ learn yoga here");	}
	
	public void pharma() {
		System.out.println("Buy medicine here...");}
	
	public void payment() {
		System.out.println("Bill paid.. collect reciepts");
		}
}

package com.xworkz.OOPconcepts;
import java.util.Date;

public class EventManagement {
	Date date_time;
	String location;
	String type_of_event;
	int budget;
	int Audience;
	String theme;
	String eventOrganiserName;
	
	public void checklist() {
	System.out.println("create an event planning checklist"); }
	
	public void event_essentials() {
	System.out.println("Establish event essentials: date_time, location, type_of_event, event_goal,Audience"); }
	
	public void budget() {
		System.out.println("Build an event budget: major categories- catering, decor & rentals"); }
	
	public void design() {
		System.out.println("Create an event design"); }
	
	public void decor() {
		System.out.println("Plan out the decor: visual elemets, music, flowers, ");}
	
	public void layout() {
		System.out.println("Using space: seatting arrangements/ seating charts, placement of electrical cords etc. ");	}
	
	public void entertainment() {
		System.out.println("Hire entertainments: sign contracts, photo booths, ");	}
}

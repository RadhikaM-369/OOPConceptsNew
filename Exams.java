package com.xworkz.OOPconcepts;
import java.util.Date;

public class Exams {
int candidateNo;
String candidateName;
int no_of_candidates;
String examCenter;
int no_of_examCenters;
int No_of_staffs;
String staffName;
Date examDate_time;
Date result_time;

public void apply() {
	System.out.println("Apply for exams");}

	public void notification() {
	System.out.println("send Notification : Exam date");}
	
	public void admitcards() {
		System.out.println("issue the admitcards ");}
	
	public void arrange() {
		System.out.println("1. arrange seats in diff. centers/bolcks for candidates 2. arrange staffs");
	}
	public void tools() {
		System.out.println("Arrange questiopapers & OMR Sheets");
	}
	public void conductExam() {
		System.out.println("Conduct the exam");
	}
	public void valuation() {
		System.out.println("valuation process: scan OMR Sheets");
	}
	public void result() {
		System.out.println("Announce result");
	}

}

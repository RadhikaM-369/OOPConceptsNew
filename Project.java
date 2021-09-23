package com.xworkz.OOPconcepts;
import java.util.Date;

public class Project {
String projectName;
String projectType;
Date startDate;
Date finishDate;
int teamMembers;
int budget;

public void start() {
	System.out.println("Start the project");}

public void requirements() {
	System.out.println("list the requirements");}

public void design() {
	System.out.println("plan/ design project architecture");}

public void implement() {
	System.out.println("developing the project");}

public void test() {
	System.out.println("Testing project for faults & failure");}

public void maintenence() {
	System.out.println("Maintenence is done to deliver the changes");}
}

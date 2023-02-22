package com.example.demo;

public class Student {
private String NAme;
private int roll;
private int rank;
public Student(int roll,String NAme, int rank) {
	super();
	this.NAme = NAme;
	this.roll = roll;
	this.rank = rank;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getNAme() {
	return NAme;
}
public void setNAme(String nAme) {
	NAme = nAme;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}

}

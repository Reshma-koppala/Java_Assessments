package com.pace.practice;

import java.util.ArrayList;

public class Ticket {
	int pnrnumber;
	String source;
	String destination;
	float price;
	public Ticket(int pnrnumber, String source, String destination, float price) {
		super();
		this.pnrnumber = pnrnumber;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	public int getPnrnumber() {
		return pnrnumber;
	}
	public void setPnrnumber(int pnrnumber) {
		this.pnrnumber = pnrnumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}

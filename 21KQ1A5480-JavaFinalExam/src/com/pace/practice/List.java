package com.pace.practice;

import java.util.ArrayList;

public class List {
	public void addTicket(Ticket ticket) {
		System.out.println("Ticket added:");
		ticket.setPnrnumber(105);
		ticket.setDestination("Hyd");
		ticket.setSource("ong");
		ticket.setPrice(150.00f);
		System.out.println(ticket.getPnrnumber());
		System.out.println(ticket.getDestination());
		System.out.println(ticket.getSource());
		System.out.println(ticket.getPrice());
		System.out.println("==========================");
		
	}
	public void showTicketBooked(int pnr,String dest,String source,float price) {
			System.out.println(pnr+" "+dest+" "+source+" "+price);
		}
	
	public void ticketCount(int size) {
		System.out.println("Count of tickets:"+size);
	}
	

}

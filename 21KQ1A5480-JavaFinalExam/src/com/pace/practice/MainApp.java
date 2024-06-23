package com.pace.practice;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket1=new Ticket(101,"pamur","ongole",115.00f);
		Ticket ticket2=new Ticket(102,"ongole","guntur",125.00f);
		Ticket ticket3=new Ticket(103,"kanigiri","ongole",135.00f);
		ArrayList<Ticket>ticketList=new ArrayList<Ticket>();
		List list=new List();
		ticketList.add(ticket1);
		ticketList.add(ticket2);
		ticketList.add(ticket3);
		
		list.addTicket(ticket3);
		
		for(Ticket ticket:ticketList) {
			int pnr=ticket.getPnrnumber();
			String dest=ticket.getDestination();
			String source=ticket.getSource();
			float price=ticket.getPrice();
			list.showTicketBooked(pnr,dest,source,price);
		}
		
		int size=ticketList.size();
		list.ticketCount(size);

	}

}

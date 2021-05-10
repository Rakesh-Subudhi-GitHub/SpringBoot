package com.rk.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rk.helper.request.PassangerInfo;
import com.rk.helper.response.TicketInfo;

@RestController
public class TicketController {

	@GetMapping("/welcome")
	public String test()
	{
		return "Welcome to TicketBooking System";
	}
	
	@PostMapping(value = "/bookedTicket",consumes = {"application/xml","application/json"},
										 produces = {"application/xml","application/json"})
	public TicketInfo bookTrainTicket(@RequestBody PassangerInfo passanger)
	{
		System.out.println("Passanger info : "+passanger);
		
		//calling ticketinfo assigne value
		TicketInfo ticket=new TicketInfo();
		
		ticket.setTicketId(new Random().nextInt(10000));
		ticket.setName(passanger.getPassangerName());
		ticket.setFrom(passanger.getFrom());
		ticket.setTo(passanger.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setPrice("785.78");
		ticket.setBookedDate("26-04-2021");
		
		return ticket;
	}//method
}//class

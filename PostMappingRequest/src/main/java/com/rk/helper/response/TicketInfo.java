package com.rk.helper.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {

	private Integer ticketId;
	private String ticketStatus;
	private String name;
	private String from;
	private String to;
	private String price;
	private String bookedDate;
}

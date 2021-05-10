package com.rk.helper.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassangerInfo {

	private String passangerName;
	private String from;
	private String to;
	private String trainNum;
}

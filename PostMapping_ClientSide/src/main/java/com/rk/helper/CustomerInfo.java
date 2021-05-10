package com.rk.helper;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class CustomerInfo {

	private Integer custId;
	private String custName;
	private String custEmail;
}

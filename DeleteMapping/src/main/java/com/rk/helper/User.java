package com.rk.helper;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class User {

	private Integer id;
	private String name;
	private String email;
}

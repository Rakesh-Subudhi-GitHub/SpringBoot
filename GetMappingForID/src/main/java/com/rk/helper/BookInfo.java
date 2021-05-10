package com.rk.helper;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class BookInfo {

	private String bookId;
	private String bookName;
	private String author;
	private Double Price;
}

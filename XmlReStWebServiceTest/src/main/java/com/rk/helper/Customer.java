package com.rk.helper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private int custId;
	private String custNamme;
	private String custEmail;
	
	//Setters & Getters
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustNamme() {
		return custNamme;
	}
	public void setCustNamme(String custNamme) {
		this.custNamme = custNamme;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	//toString
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custNamme=" + custNamme + ", custEmail=" + custEmail + "]";
	}
	
	
}

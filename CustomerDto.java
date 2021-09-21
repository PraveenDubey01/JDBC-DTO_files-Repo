package edu.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	private int accno;
	private String cname;
	private String email;
	private int balance;
	public String toString() {
		return accno +"," + cname +"," + email +"," + balance;
	}
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
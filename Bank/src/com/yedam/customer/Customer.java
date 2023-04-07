package com.yedam.customer;

import java.sql.Date;

import lombok.Data;

@Data

public class Customer {
	private int customerId;
	private String customerPw;
	private String customerName;
//	private int accountId;
	private String customerGrade;
	
//	//OUTER JOIN용
//	private int balance;
//	private Date credate;
}

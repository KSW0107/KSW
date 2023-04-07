package com.yedam.account;

import java.sql.Date;

import lombok.Data;

@Data
public class Account {
	
	private int accountId;
	private int customerId;
	private int balance;
	private Date credate;
	
	//JOIN시 customer Table에 있는 customer_name을 저장하기 위해 필드추가
	private String customerName;
	
	
	
	
	
	
	
}

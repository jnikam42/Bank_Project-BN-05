package com.rbi.operation;

import java.util.Scanner;

import com.rbi.model.Account;

public class Operation {
	
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	public void createAccount()
	{
		
		System.out.println("WELCOME TO SBI ---Please fill All the Currect Required Information to creat the Account");
		
		System.out.println("Enter Your Name");
		ac.setCustomerName(sc.nextLine());
		while(true)
		{
		System.out.println("Enter Deposite Money");
		
		double money=sc.nextDouble();
		if(money>=500)
		{
			ac.setMoney(money);
			break;
		}
		else
		{
			System.out.println("Please Enter Minimum Deposite Amount Rs. 500 ");
		}
		
	}
		
		
		
		
		
	}

}

package com.rbi.admin;

import java.util.Scanner;

import com.rbi.operation.Operation;

public class Admin_Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Operation op=new Operation();
		
		       System.out.println("Enter Your Choice");
		       System.out.println("1.CREATE ACCOUNT \n2.CHECK BALENCE");
		       int x=sc.nextInt();
		       
		       switch(x)
		       {
		       case 1:op.createAccount();
		    	   
		    	   break;
		       case 2:
		    	   
		    	   break;
		    	   
		    	   default :
		    		   System.out.println("Please Enter Valied Option");
		       }

	}

}

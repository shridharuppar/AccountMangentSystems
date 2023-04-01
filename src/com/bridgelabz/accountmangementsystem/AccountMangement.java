package com.bridgelabz.accountmangementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMangement  implements AddAccount, DisplayAccontDetails{
  List<Account> accounts = new ArrayList<Account>();
  Scanner scanner= new Scanner(System.in);
  Account account=new Account(0, null, null, null, 0);

 public void addAccount( ) {
	 System.out.println("Enter the account number :  ");
	 int accountnumber =scanner.nextInt();
    account.setaccountNumber();
   
    System.out.println("Enter Account Holder Nmae:   ");
    String accountHolderName =scanner.nextLine();
    account.setaccountHolderName();
    
    System.out.println("Enter Account Holder Dob :    ");
    String accountHolderDob = scanner.nextLine();
    account.setaccountHolderDob();
    
    System.out.println("Enter account accountHolderEmail:     ");
    String accountHolderEmail=scanner.nextLine();
    account.setaccountHolderEmail();
    
    System.out.println("Enter account Hoder Mobile Number:    ");
     String accountHoderMobileNumber=scanner.nextLine();
     account.setaccountHolderMobileNumber();
     
   accounts.add(account);
     
     System.out.println("added sucessfully");
 }
 

public void DisplayAccountDetails() {
	if (accounts.isEmpty()) {
System.out.println("Any Account is not created yet");		
	}
 
	System.out.println("account details");
	for (int i = 0; i<accounts.size(); i++) {
		System.out.println(account.accountNumber);
		System.out.println(account.accountHolderName);
		System.out.println(account.getaccountHolderDob());
		System.out.println(account.accountHolderEmail);
		System.out.println(account.accountHolderMobileNumber);
		
	}	
		
		
		
	
 }


@Override
public void displyaccountDetails() {
	// TODO Auto-generated method stub
	
}

	
}

package com.bridgelabz.accountmangementsystem;

public class Account {
int accountNumber;
public String accountHolderName;
String accountHolderDob; 
String accountHolderEmail;
 long accountHolderMobileNumber;

public Account(int accountNumber,String accountHolderName, String accountHolderDob, String  accountHolderEmail, long accountHoderMobileNumber ) {
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.accountHolderDob = accountHolderDob;
	this.accountHolderEmail =accountHolderEmail;
	this.accountHolderMobileNumber = accountHolderMobileNumber;	
	
	
	
	
}
 public int getaccountNumber(){
	 return accountNumber;
 }
public void setaccountNumber( ){
	this.accountNumber =accountNumber;
}
public String getaccountHolderName() {
	return accountHolderName;
}
public void setaccountHolderName(){
	this.accountHolderName= accountHolderName;
	}
public String getaccountHolderDob(){
	return accountHolderDob;
}
public void setaccountHolderDob() {
	this.accountHolderDob=accountHolderDob;
}
public String getaccountHolderEmail(){
	return accountHolderEmail;
}
public void setaccountHolderEmail() {
	this.accountHolderEmail=accountHolderEmail;
}
public long getaccountHolderMobileNumber(){
	return accountHolderMobileNumber;
}
public void setaccountHolderMobileNumber(){
	this.accountHolderMobileNumber=accountHolderMobileNumber;
}

}
	




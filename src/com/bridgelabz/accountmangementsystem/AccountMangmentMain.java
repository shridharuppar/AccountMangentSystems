package com.bridgelabz.accountmangementsystem;

public class AccountMangmentMain {
  public static void main(String[] args) {
	System.out.println("welcome to Account MAngement System");
	   
	AccountMangement accountMangement=new AccountMangement();
	accountMangement.addAccount();
	accountMangement.DisplayAccountDetails();
}
}

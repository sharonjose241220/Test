package com.obsqura.bank.recurringdeposit;
import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		int amount = sc.nextInt();
		System.out.println("Enter the number of years: ");
		int duration = sc.nextInt();
		RBI obj = new Hdfc();
		obj.recurringDeposit(amount,duration);
	}
}

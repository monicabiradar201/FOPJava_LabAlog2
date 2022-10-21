package com.greatlearning.currencydenomination;
import java.util.Scanner;
public class Transaction {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfTrans,target;
		System.out.println("Enter the number of transactions in an array");
		noOfTrans=sc.nextInt();
		int [] transArray= new int [noOfTrans];
		System.out.println("Enter the transactions");
		for(int i=0;i<noOfTrans;i++)
		{
		transArray[i]=sc.nextInt();
		}
		System.out.println("what is the target need to be achieved?");
		target = sc.nextInt();
		int checkVar=0;
		int idx=1;
		boolean checkcond= false;
		while(checkVar<target){
		for(int i=0;i<noOfTrans;i++)
		{
		checkVar += transArray[i];
		 idx += i;
		if(checkVar >= target)
		{
			checkcond=true;
			break;
			}
		}
		if (checkcond==true)
		{
			System.out.println("Target is achieved after"+ idx+ "transactions");
			
		}
		else
		{
		System.out.println("Target is not achieved");
		}

		}
	}
}




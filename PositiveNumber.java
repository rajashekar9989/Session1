package org.prowess.mod1;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {

	 Scanner scan = new Scanner(System.in);
	 System.out.printf("Enter the  number");
	 int num=scan.nextInt();
	   if(num>0) {
		   System.out.println("The provided number is  :" +num  +" " + "it is positive Number" );
	   }
		  else if (num<0) {
			   System.out.println("the provided number is :" + num  + "negative");
		   }
		  else {
			  System.out.println("The provided numbers is neither positive nor negative (i.e zero");
		  }
	   }
	 

	}



package pack;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		float  s=sc.nextFloat();
		
	
		
		if(s%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}

	}

}

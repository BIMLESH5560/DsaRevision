package InterviewQuestion;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc  = new  Scanner(System.in);
		int number = sc.nextInt();
		int rev=0; int r; 
		//Dint a= number;
		while(number>0) {
		 r=number%10;
		 rev=rev*10+r;
		 number =number/10;
		 
	  }
		System.out.println(rev);
     }
	}



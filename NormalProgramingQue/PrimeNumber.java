package NormalProgramingQue;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter number");
		 Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
		  if(isPrime(number)) {
			  System.out.println("Number is prime");
		  }
		  else {
			  System.out.println("Number is not prime");
		  }
		 

	}
	public  static boolean  isPrime( int num) { 
		 
		for(int i = 2; i<=num; i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}

}

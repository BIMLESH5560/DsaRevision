package InterviewQuestion;

import java.util.Scanner;

public class oddEveProgram {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		  number =sc.nextInt();
		  if(number%2==0) {
			  System.out.println("number is even"+ number);
		  }
		  else {
			  System.out.println("number is odd" + number);
		  }
		

	}

}

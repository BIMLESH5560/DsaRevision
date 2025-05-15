package InterviewQuestion;

import java.util.Scanner;

public class FibnacciSeries {
  public static void main(String[] args) {
	  System.out.println("Enter a number");
	  Scanner sc =new Scanner(System.in);
	   int number =sc.nextInt();
	   int first=0; int second =1; int next;
	   for(int i=1;i<=number; i++) {
		   System.out.println(first + " ");
		      next = first+second;
		         first=second;
		         second=next;
		   
	   }
   }
}

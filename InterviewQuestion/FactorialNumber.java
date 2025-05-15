package InterviewQuestion;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
	 int fact =1;
	 System.out.println("Enter number");
	 Scanner sc =new Scanner(System.in);
	 int number =sc.nextInt();
     for(int i=1; i<=number; i++) {
    	 fact=fact*i;
		 
	 }
     System.out.println("Find factorial "+ fact);
	}

}

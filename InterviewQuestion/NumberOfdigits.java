package InterviewQuestion;

import java.util.Scanner;

public class NumberOfdigits {
	public static void main(String[] args) {
		int number;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
    	if(number<0) {
			number=number*-1;	
			} 
    	else if(number==0) {
		   number=1;		
		   }
		while(number>0) {
			number =number/10;
			count++;
		}
		System.out.println("Digit find" + count); 
		
		
	}

}

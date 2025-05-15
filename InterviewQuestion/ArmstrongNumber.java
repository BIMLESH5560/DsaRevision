package InterviewQuestion;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int  number;
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter number");
		number =sc.nextInt();
		
		System.out.println("armstrong number"+isArmstrong(number));
		
	}
	static boolean isArmstrong(int  num) {
		int digits=0; int  temp;
		temp= num;
		int sum=0;
		while(temp>0) {
			temp =temp/10;
			digits++;
		}
		System.out.println("number of digits" + digits);
		while(temp>0) {
			int lastDigit=temp%10;
			sum =(int) (sum+Math.pow(lastDigit, digits));
			temp=temp/10;
			
		}
		if(sum==num) { 
			return true;
	}
	else {
		return false;
	}
	}

}

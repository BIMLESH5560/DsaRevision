package Patttern;

import java.util.Scanner;

public class TringlePattern {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 int number =sc.nextInt();
		 for(int i=0; i<number; i++) {
			 for(int j=0; j<number-i-1; j++) {
				 System.out.print(" ");
				 }
			 for(int j=0; j<2*i+1; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}

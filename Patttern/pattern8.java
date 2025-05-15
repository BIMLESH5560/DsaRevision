package Patttern;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number =sc.nextInt();
		int start=1;
		for (int  i=1; i<=number; i++) {
			for( int j=0;j<i; j++) { 
				System.out.print(start+j+" ");
			}
			System.out.println();
			start=start+i-1;
		}
		
	}
 }


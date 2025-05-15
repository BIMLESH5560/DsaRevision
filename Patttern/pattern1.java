package Patttern;

import java.util.*;
public class  pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		// Part 1
      for(int i=0;i<=n/2;i++) {
    for(int j=0;j<n/2+i;j++) System.out.print(" ");
    for(int j=0;j<n-2*i;j++) System.out.print("@");
       System.out.println();
      }
      
      // Part 2
      for(int i=0;i<n;i++) {
    	  if(i==0) {
    		for(int j=0;j<n;j++) System.out.print("*");
    	  } else {
    		for(int j=0;j<n;j++) {
    			if(j==0 || j==n-1) {
    				System.out.print("*");
    			} else {
    				System.out.print(" ");
    			}
    		}
    	  }
    	  System.out.println();	
      }
    	  
	}

}
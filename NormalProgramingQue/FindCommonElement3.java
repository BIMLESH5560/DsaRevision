package NormalProgramingQue;

import java.util.HashSet;

public class FindCommonElement3 {
	public static void main(String[] args) {
		int arr1[] = {11,24,88,23,56,88,24};
		int arr2[] = {66,33,44,24,88,43};
		   HashSet<Integer> hs1 = new  HashSet<>();
		   HashSet<Integer> hs2 = new  HashSet<>();
		   for(int no:arr1) {
			  hs1.add( no);  
		   }
		   for(int no:arr2) {
			   hs2.add( no);
			     } 
		   for(int no:hs2) {
			    boolean b=hs1.add( no);
			    if(b==false) {
			    	System.out.println(no);
			    }
		   }
		 }
	}



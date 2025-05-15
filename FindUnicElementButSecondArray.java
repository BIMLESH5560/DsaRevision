package ARRAYQUESTION;

import java.util.*;

public class FindUnicElementButSecondArray {
	public static void main(String[] args) {
		int arr1[]= {7,5,6,3,51,24,8};
		int arr2[]= {23,6,7,51,43,8,9};
	   List<Integer>list=new ArrayList<>();
	   List<Integer>list1=new ArrayList<>();
	   
	   for(int num:arr1) {
		   list.add(num);
	   }
	   
	   for(int num:arr2) {
		   if(!list.contains(num)) {
			   list1.add(num);
		   }
	   }
	   
	  int [] ans=new int[list1.size()];
	  int ind=0;
	  for(int num:list1) {
		  ans[ind]=num;
		  ind++;
	  }
	  for(int i=0;i<ans.length;i++) {
		  System.out.print(ans[i]+ " ");
	  }

	}

}

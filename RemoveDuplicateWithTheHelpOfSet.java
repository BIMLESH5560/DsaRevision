package ARRAYQUESTION;

import java.util.HashSet;
import java.util.Set;
// 
public class RemoveDuplicateWithTheHelpOfSet {
	public static void main(String[] args) {
		int arr[]= {1,2,4,3,1,2,4};
		
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
//		int[]res=new int[set.size()];
//		int ind=0;
//		for(int num:set) {
//		   res[ind++]=num;
//		}
		
//		for(int ans:set) {
//			System.out.print(ans + " ");
//		}
		
		System.out.println(set);
		
		
		
	}

}

package ARRAYQUESTION;

import java.util.HashSet;

public class FindFirstDuplicateElementWithHashset {
	public static void main(String[] args) {
		int arr[]= {6,3,2,7,9,3,1};
		int temp=-1;
		HashSet<Integer> hs=new HashSet<>();
		for(int i=arr.length-1; i>0; i--) {
			if(hs.contains( arr[i])) {
				temp=i;
			}
			else {
				hs.add( arr[i]);
			}
		}
		if(temp!=-1) {
			System.out.println("First duplicate element is" +arr[temp]+ " ");
		}else {
			System.out.println("first element is not available in a list");
		}
	}

}

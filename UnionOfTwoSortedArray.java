package ARRAYQUESTION;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
	public static  ArrayList<Integer>  union(int arr[],int arr1[]) {
		ArrayList<Integer> list=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr.length && j<arr1.length) {
			if(arr[i]==arr1[j]) {
				if(list.size()>0 && list.get(list.size()-1)!=arr[i]) {
					list.add( arr[i]);
				}
				else if(list.size()==0) {
					list.add( arr[i]);
				}
				i++;
				j++;
			}
			else if(arr[i]<arr1[j]) {
				if(list.size()>0 && list.get(list.size()-1)!=arr[i]) {
					list.add( arr[i]);
				}
				if(list.size()>0 && list.get(list.size()-1)!=arr[i]) {
					list.add( arr[i]);
				}
				i++;
			}
			else {
				if(list.size()>0 && list.get(list.size()-1)!=arr[i]) {
					list.add( arr[j]);
				}
				if(list.size()>0 && list.get(list.size()-1)!=arr[i]) {
					list.add( arr[i]);
				}
				j++;
				
			}
		}
		while(i<arr.length) {
			if(list.get( list.size()-1)!=arr[i]) {
				list.add( arr[i]);
			}
			i++;
		}
		while(j<arr1.length) {
			if(list.get( list.size()-1)!=arr1[j]) {
				list.add( arr1[j]);
			}
			j++;
		}
		
		return list;
		
	}
	
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6,7,8,8,9};
	int arr1[]= {1,2,3,4,5,7,10,12};
	    ArrayList<Integer> ans = union(arr,arr1);
	    for(int num:ans) {
	    	System.out.print(num + " ");
	    }
}
}

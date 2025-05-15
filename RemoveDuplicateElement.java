package ARRAYQUESTION;
//sorted arrays is given
public class RemoveDuplicateElement {
	public static void Duplicate(int arr[]) {
		int j=0;
		int temp[]=new int [arr.length];
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
				 
			}
		}
		temp[j]=arr[arr.length-1];
		for(int num:temp) {
			System.out.print(num + " ");
		}
		 }
	public static void main(String[] args) {
		int  arr[]= {2,4,5,6,6,7,7};
//		 
		 Duplicate(arr);
	 }
	}

	 


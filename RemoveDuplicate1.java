package ARRAYQUESTION;

//sorted array
public class RemoveDuplicate1 {
	public static void Duplicate1 (int arr[]) {
		int j=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		 
		for(int i=0; i<j+1; i++ ) {
			System.out.print(arr[i]+ " ");
	}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,4,6,6,7,8,9};
		Duplicate1(arr);
		 
	}

}

package NormalProgramingQue;

public class FindMaximumElementInArray {
	public static void main(String[] args) {
		int arr[]= {3,5,1,7,8,9,10};
		int max= arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int secondMax=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		System.out.println("Second maximum number"+ secondMax); 
	}

}

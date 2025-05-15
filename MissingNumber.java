package ARRAYQUESTION;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6,7,8,9,10};
	int num=arr.length+1;
	int totalSum=(num*(num+1))/2;
	int sum=0;
	
	for(int i=0; i<arr.length; i++) {
		sum= sum+arr[i];
	  }
//	 int res=totalSum-sum;
		System.out.println("missing number" + (totalSum-sum));
	}
}

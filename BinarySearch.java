package ARRAYQUESTION;

public class BinarySearch {
	public static int search(int[]arr,int target,int n) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) return mid;
			else if(target>arr[mid]) {
				low=mid+1;
			} else {
				high=mid-1;
		}	
			}
	return -1;
 }
	
public static void main(String[] args) {
		int arr[]= {1,3,4,7,8,10,12,16};
	int target=10;
		int n=arr.length;
	int ans=search(arr,target,n);
	System.out.println(ans);
	
  	 
	}
}

 








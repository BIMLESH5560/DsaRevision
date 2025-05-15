package ARRAYQUESTION;

public class MaximumConsecutiveOnes {
	public static int MConsecutiveOnes(int arr[]) {
		int left=0;
		int ans=-1;
		int window=0;
		for(int right=0; right<arr.length; right++) {
			window+=arr[right];
			
			while(right-left+1!=window ) {
				window-=arr[left];
				left++;
			}
			ans=Math.max(ans,right-left+1);
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,1,0,1,1,1};
		 System.out.println(MConsecutiveOnes(arr));
	}

}

package ARRAYQUESTION;

public class MoveAllZero {
	public static void moveZeroelement(int arr[]) {
		int insertposion=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[insertposion]=arr[i];
				insertposion++;
			}
		}
		while(insertposion<arr.length) {
			arr[insertposion++]=0;
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,30,0,1,7,0,9,0};
		moveZeroelement(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

package ArraySorting;

public class SelectionSort {
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	  }
	public static void main(String[] args) {
		int arr[]= {34,55,2,8,9,11};
		for(int i=0; i<arr.length; i++) {
			int smallest=i;  
			for(int j=i+1; j<arr.length-1; j++) {
				if(arr[smallest]>arr[j]) {
				 smallest=j;
				}
			}
			int temp= arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		 }
		printArray(arr);
	}
}

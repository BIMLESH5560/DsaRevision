package ARRAYQUESTION;

public class Se4condLargestElement { 
	public static void main(String[] args) {
		int arr[]= {23,4,5,7,89,45,1,3,4};
		int largest=Integer.MIN_VALUE;
		int Secondlargest=Integer.MIN_VALUE;
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				Secondlargest=largest;
				largest=arr[i];
				
			}
			if(arr[i]>Secondlargest && arr[i]!=largest) {
				Secondlargest=arr[i];
				
			}
		}
		System.out.println(Secondlargest);
	}

}

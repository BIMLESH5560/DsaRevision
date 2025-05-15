package ARRAYQUESTION;

public class FIndFirstDuplicateElement {
public static void main(String[] args) {
	int arr[]= {3,4,5,6,5,6,8,9};
	int temp=0;
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if((arr[i]==arr[j])&&(i!=j)) {
				System.out.println("First duplicate element is " +arr[i]+" ");
				temp=temp+1;
				break;
			}
		}
		if(temp>0) {
			break;
		}
	}
	  
  }
}

package ARRAYQUESTION;

public class FindDuplicateElement {
	public static void DuplicateElement(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
				 System.out.println("DuplicateElement"+arr[i]+" ");
				}
		
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {7,4,2,6,7,8,2};
		    DuplicateElement(arr);
				}
			}
		
	        
	



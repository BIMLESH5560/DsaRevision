package ARRAYQUESTION;

public class LenearSearch {
	public static void main(String[] args) {
		int arr[]= {2,3,56,10,6,8};
		int itom=10;
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==itom) {
				System.out.println("itom present in this index" +i+" ");
				temp=temp+0;
				
			}
		}
		if(temp==0) {
			System.out.println("itom is not present");
		} 
		
	}

}

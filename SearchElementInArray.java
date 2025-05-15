package ARRAYQUESTION;

public interface SearchElementInArray {
  public static int LinearSearch(int arr[],int target) {
	  for(int i=0; i<arr.length; i++) {
		  if(arr[i]==target) {
			  return i;
		  }
	  }
	  return -1;
  }
	public static void main(String args[]) {
		int  arr[]= {7,8,4,2,9,10,45,56};	
		int target=10;  
		int index=LinearSearch( arr, target);
		 System.out.println( " Element present to this index "+ index);
		
	}
}

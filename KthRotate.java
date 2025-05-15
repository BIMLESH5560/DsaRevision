package ARRAYQUESTION;

public class KthRotate {
	 public static void rotate(int array[],int start,int end) {
		 while(start<end) {
			 int temp=array[start];
			 array[start]=array[end];
			 array[end]=temp;
			 start++;
			 end--;
		 }
	 }
	public static void main(String[] args) {
		int array[]= {22,44,55,66,34,23 };  	       
	        int k=3;
	        int start=0;
	        int end= array.length-1;
	       rotate(array,0,end);
	       rotate(array,0,k-1);
	       rotate(array,k,end);
	       
	       for(int num:array) {
	    	   System.out.print(num + " ");
	       }
	    }
	}

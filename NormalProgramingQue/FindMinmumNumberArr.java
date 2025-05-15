package NormalProgramingQue;

public class FindMinmumNumberArr {
 public static void main(String[] args) {
	   int arr []= {22,33,55,67,88,34,90};
	     int min =arr[0];
	    for(int i =1; i<arr.length; i++) {
	    	if(arr[i]<min) {
	    		min=arr[i];
	    	}
	    }
	    System.out.println("minimum element in array"+ min);
}
}

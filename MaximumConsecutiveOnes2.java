package ARRAYQUESTION;

public class MaximumConsecutiveOnes2 {
      public static int maxconons(int arr[]) {
    	  int maxCount=0;
    	  int count=0;
    	  for(int num:arr) {
    		  if(num==1) {
    			  count++;
    			  maxCount=Math.max(maxCount, count);
    		  }
    		  else  {
    			  count =0;
    		  }
    	  }
    	  return maxCount;
      }
	public static void main(String[] args) {
		 int arr[]= {1,1,0,1,1,1};
		 System.out.println(maxconons(arr));

	}

}

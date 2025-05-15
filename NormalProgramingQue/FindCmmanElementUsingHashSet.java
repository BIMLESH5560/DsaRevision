package NormalProgramingQue;
import java.util.HashSet;

public class FindCmmanElementUsingHashSet {
	public static void main(String[] args) {
		int arr1[] = {11,24,88,23,56,88};
		int arr2[] = {66,33,44,24,88,43};
		   HashSet<Integer> hs = new  HashSet<>();
		   for(int no:arr1) {
			  hs.add( no);  
		   }
		   for(int no:arr2) {
			    boolean b=hs.add(no);
			    if(b==false) {
			    	System.out.println(no);
			    } 
				   
			   
		   }
	}

}

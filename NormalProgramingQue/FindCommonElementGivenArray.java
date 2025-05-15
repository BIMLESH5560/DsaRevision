	package NormalProgramingQue;
 import java.util.HashSet;

public class FindCommonElementGivenArray {
	public static void main(String[] args) {
		int arr1[]= {1,34,5,7,8,3,5};
		int arr2[]= {3,5,11,12,9,32};
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					 hs.add( arr1[i]);
					 break;
				}
			}
			
		}
		for(int no:hs) {
			System.out.println(no + " ");
		}
		
	}

}

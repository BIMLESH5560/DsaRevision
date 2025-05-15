package NormalProgramingQue;

public class GeneratePair {

	public static void main(String[] args) {
		int [] arr= {2,3,4,6,7,1};
		int target=5;
		for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]+arr[j]==target) {
				 System.out.print("("+arr[i]+","+arr[j]+")");
			 }
		 }
		}

	}

}

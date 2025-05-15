package ARRAYQUESTION;
  public class CountOddEvenFromGivenArray {
	public static int [] CountoddevenNumber(int arr[]) {
		int count []=new int [2];
		for( int i=0;i<arr.length;i++) {
			if(i%2==0) {
				count[1]++;
			}
			else {
				count[0]++;
			}
		}
		return count;
		 
	}

	public static void main(String[] args) {
		 int arr[]= {23,5,7,8,4,24,76,11,13};
		 int count []=  CountoddevenNumber(arr);
		 System.out.println(count[0]);
		 System.out.println(count[1]);

	}

}

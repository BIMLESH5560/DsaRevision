package ARRAYQUESTION;

public class shiftOddNumberEvenN {
     public static void main(String[] args) {
		int arre1 [] ={ 45,7,8,23,6,4};
		int even=0;
		for(int i=0; i<arre1.length; i++) {
			if(arre1[i]%2==0) {
				int temp=arre1[even];
				arre1[even]=arre1[i];
				arre1[i]=temp;
				even++;
			}
			
			}
		for(int i=0;i<arre1.length;i++) {
			System.out.print(arre1[i] +" ");
		}
		
	}
}

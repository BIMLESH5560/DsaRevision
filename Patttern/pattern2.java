package Patttern;

public class pattern2 {
	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		for(int i=1; i<=num1; i++) {
			for(int j=1; j<=num2; j++) {
				if(i==1 || i==num1 || j==1 || j==num2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

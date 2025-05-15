package NormalProgramingQue;
import java.util.*;
public class FindGreater3Num {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num1= sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 
		 if(num1>num2) {
			 System.out.println(num1+"num1 is greater");
		 }
		 else if(num2>num3) {
			 System.out.println(num2 +"num2 is greater");
		 }
		 else {
			 System.out.println("num 3 is greater");
		 }
				 

	}

}

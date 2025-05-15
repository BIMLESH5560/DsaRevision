package NormalProgramingQue;
 import java.util.*;
public class CheckPalindrow {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  int temp=num;
	  int rev=0,rem;
	  while(temp!=0) {
		  rem=temp%10;
		  rev=rev*10+rem;
		  temp = temp/10;
	  }
	  if(num==rev) {
		  System.out.println(num+"Number is plindrow");
		  
	  }
	  else {
		  System.out.println("number is not plindrow");
	  }

	}

}

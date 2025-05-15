package ARRAYQUESTION;

public class SumOnlyIntegerButSpecialCharacterAvailable {
	public static int sumIntegers(String[]array) {
		int sum=0;
		for(String element:array) {
			try {
			int number= Integer.parseInt(element);	
		     sum=sum+number;
			}
			catch(Exception e) {
			  }
		}
		return sum;
	}
	public static void main(String[] args) {
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		String s="my
		int sum = sumIntegers(array);
		System.out.println(sum);
	}

}

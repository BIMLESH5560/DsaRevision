package ARRAYQUESTION;

public class RemoveVobals {
	public static void main(String[] args) {
			String input="Chak.De India!";
			StringBuilder str=new StringBuilder();
			for(int i=0; i<input.length(); i++) {
				char ch=input.charAt(i);
				if (ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && 
		                ch != 'i' && ch != 'I' && ch != 'o' && ch != 'O' && 
		                ch != 'u' && ch != 'U') {
		                str.append(ch);
				}
			}
			System.out.println(str);

	}

}

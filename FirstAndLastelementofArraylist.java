package ARRAYQUESTION;

import java.util.ArrayList;

public class FirstAndLastelementofArraylist {

	public static void main(String[] args) {
		 ArrayList<String> arraylist= new ArrayList<>();
		   arraylist.add( "bimlesh");
		   arraylist.add( "ravi");
		   arraylist.add( "Abhishek");
		   arraylist.add( "chitransh");
		   if(!arraylist.isEmpty()) {
			   String first=arraylist.get(0);
			   String last=arraylist.get(arraylist.size()-1 );
			   System.out.println("print first element" + first);
			   System.out.println("print last element" +last);
			   
		   }
		   else {
			   System.out.println("Arraylist is empty");
		   }
		   
	}

}

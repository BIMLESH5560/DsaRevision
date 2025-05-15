package collection;
import java.util.*;
import java.util.ArrayList;
public class arraylist {
public static void main(String args[]) {
	ArrayList<String> StudentName = new  ArrayList<>();
	StudentName.add("bimlesh");
	StudentName.add( "Abhishek");
	System.out.println(StudentName);
	StudentName.add( 2,"ravi");
	System.out.println(StudentName);
	ArrayList<String> newStudentName = new ArrayList<>();
	newStudentName.add( "chitru");
	newStudentName.add( "KALU");
	StudentName.addAll(newStudentName);
	System.out.println(StudentName);
	System.out.println(StudentName.get(2));
	
}

}

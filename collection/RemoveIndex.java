package collection;
import java.util.*;
import java.util.ArrayList;
public class RemoveIndex {
	public static void main(String args[]) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add( 20);
		list.add( 80);
		list.add( 90);
		list.add( 30);
		list.add( 10);
		list.add( 29);
		list.add( 25);
		System.out.println(list);
		list.remove( 3);
		System.out.println(list);
		list.remove(Integer.valueOf( 10));
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}

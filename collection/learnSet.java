package collection;
 import java.util.*;
 import java.util.HashSet;
public class learnSet {

	public static void main(String[] args) {
		 // do not allow duplicate value
		Set<Integer> set = new HashSet<>();
		set.add( 60);
		set.add( 63);
		set.add( 64);
		set.add( 61);
		set.add( 68);
		System.out.println(set);
		set.remove( 63);
		System.out.println(set);
		set.contains( 71);
		System.out.println(set.contains(81));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);

	}

}

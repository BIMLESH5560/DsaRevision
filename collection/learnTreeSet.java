package collection;
import java.util.TreeSet;
import java.util.Set;
public class learnTreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
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

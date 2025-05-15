package collection;
import java.util.Stack;
public class learnStack {
	public static void main(String args[]) {
		Stack <String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Elephant");
		animals.push("Cow");
		animals.push("Tiger");
		animals.push("Horse");
		System.out.println("Stack" +animals);
		System.out.println(animals.peek());
		animals.pop();
		System.out.println("Stack" +animals);
		System.out.println(animals.peek());
	}

}

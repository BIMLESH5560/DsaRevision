package collection;
 import java.util.LinkedList;
  import java.util.Queue;
  public class LearnLinkedlistQue{

	public static void main(String[] args) {
	Queue <Integer> queue = new LinkedList<>();
	queue.offer( 35);
	queue.offer( 38);
	queue.offer( 39);
	queue.offer( 36);
	queue.offer( 34);
	queue.offer( 31);
	System.out.println(queue);
	queue.poll();
	System.out.println(queue.poll());
	System.out.println(queue);
	System.out.println(queue.peek());
	

	}

}

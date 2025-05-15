package collection;
import java.util.Comparator;
import java.util.PriorityQueue;
 import java.util.Queue;
public class learnPriorityqueue {

	public static void main(String[] args) {
		 Queue<Integer> pq=new  PriorityQueue<>(Comparator.reverseOrder());
           pq.offer(22);
           pq.offer( 98);
           pq.offer( 54);
           pq.offer( 23);
           System.out.println(pq);
           pq.poll();
           System.out.println(pq);
           System.out.println(pq.peek());
	}

}

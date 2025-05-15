package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckArraysize{
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
           for(int i=0;i<list.size(); i++) {
        	   System.out.println("LIST SIZE IS " +list.get( i));
        	   
           }
           for(Integer element: list) {
        	   System.out.println("list size is"+element);
           }
           
           Iterator<Integer> it= list.iterator();
           while(it.hasNext()) {
        	   System.out.println("ITERATOR"+it.next());
           }
           
	}

}

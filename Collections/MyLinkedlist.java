package Collections;
import java.util.*;
public class MyLinkedlist{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
    //add()
        list.add("Apple");
        list.add("umesh");
        list.add("prasanth");
        System.out.println("After add: "+list);

        //add(index,element)
        list.add(2, "string");
        System.out.println("After inserting : "+list);

        //addFirst
        list.addFirst("king varma");
        System.out.println("Afer Adding: "+list);

        //addLast
        list.addLast("5");
        System.out.println("After adding at last: "+list);

        //get(index)
        System.out.println("Element at index 2:"+list.get(2));

        //getFirst()
        System.out.println("First element is: "+list.getFirst());

        //getLast()
        System.out.println("Last element in list is: "+list.getLast());

        //set(index,ele)
        list.set(2, "Bongu");
        System.out.println("After replacing: "+list);

        //remove(index)
        list.remove("umesh");
        System.out.println("After removing: "+list);

        //removeFirst & removeLast
        list.removeFirst();
        System.out.println("After removing first element: "+list);
        list.removeLast();
        System.out.println("After removing last element: "+list);

        //contains
        System.out.println("contains (prasanth)? :"+list.contains("prasanth"));

        //Indexof & lastIndexOf
        list.add("prasanth");
        System.out.println("Last index of prasanth"+list.lastIndexOf("prasanth"));

        //size
        System.out.println("Size of list is: "+list.size());

        //isEmpty
        System.out.println("Is list empty? :"+list.isEmpty());

        //Iterator
        System.out.println("Iterating using iterator: ");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //descendingIterator
        System.out.println("Iterating in reverse order: ");
        Iterator<String> descIt=list.descendingIterator();
        while(descIt.hasNext()){
            System.out.println(descIt.next()+" ");
        }
        System.out.println();

        //peek()
        System.out.println("Peek element: "+list.peek());

        //poll()
        list.poll();
        System.out.println("poll (removes head): "+list);

        //offer()
        list.offer("ghost");
        list.offerFirst("prasanth");
        list.offerLast("umesh");
        System.out.println("After offer: "+list);

        //clear()
        list.clear();
        System.out.println("After clear:"+list);
    }
    
}

package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();

        //add()

        num.add(5);
        num.add(7);
        num.add(10);
        System.out.println("Initial List: "+num);

        //add(Index,element)

        num.add(1, 15);
        // num.add(5, 7);
        // num.add(7, 45);
        System.out.println("After inserting :"+num);

        //get(index)

        System.out.println("Element at Index 2:"+num.get(1));

        //set(index,element)

        num.set(3, 65);
        System.out.println("Afer replacing with 65: "+num);
        //remove Index

        num.remove(3);
        System.out.println("After removing: "+num);

        //remove(object)

        num.remove(Integer.valueOf(15));
        System.out.println("After removing specific element: "+num);

        //contains()

        System.out.println("contains 7?: "+num.contains(7));

        //size()

        System.out.println(num.size());

        //isEmpty()

        System.out.println("Is list Empty ?"+num.isEmpty());

        //Iterator

        System.out.println("Using Iterator");
        Iterator<Integer> it=num.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println();

        //sublist()
        num.add(13);
        num.add(16);
        List<Integer> sub=num.subList(0, 2);
        System.out.println("Sublist(0,2) "+sub);

        //toArray()
        Object[] arr=num.toArray();
        System.out.println("Array: ");
        for(Object ob:arr){
            System.out.print(ob+" ");
        }
        System.out.println();
        //clear
        num.clear();
        System.out.println("After clear: "+num);


    }
}

package Collections;
import java.util.*;
public class Vectors {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("string");
        v.add("integer");
        v.add("boolean");
        v.add("double");

        System.out.println("First element is: "+v.firstElement());
        System.out.println("Last element is: "+v.lastElement());

        //enumeration
        System.out.println("Iteration using Enumeration");
        Enumeration<String> en= v.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }    
        System.out.println();
        //get(index)
        System.out.println("Element at index 2: "+v.get(2));

        
    }
}

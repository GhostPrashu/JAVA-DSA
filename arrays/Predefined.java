import java.util.*;
public class Predefined {
    public static void main(String args[]){
        int[] n={5,4,3,2,1};
        Arrays.sort(n);
        for (int i : n){
        System.out.print(i);
        }
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
        System.out.println(Arrays.toString(n));

            // equals
        int [] num={3,4,5,2,1};
        System.out.println(Arrays.equals(n, num));

            //copyof

        int copy[]= Arrays.copyOf(n, 4);
        System.out.print(Arrays.toString(copy));

            //copy of range

        int rangecopy[]=Arrays.copyOfRange(n,1,7);
        System.out.println(Arrays.toString(rangecopy));

            //fill

        int filled[] =new int[4];
        Arrays.fill(filled, 0);
        System.out.println(Arrays.toString(filled));

            //binarysearch
        
        int in=Arrays.binarySearch(num, 2);
        System.out.println(in);

            //deepequals
        
        int[][] nest1={{1,2},{3,4}};
        int[][] nest2={{1,2},{3,4}};
        System.out.println(Arrays.deepEquals(nest1, nest2));

        
    }
}

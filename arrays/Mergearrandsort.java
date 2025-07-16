import java.util.Arrays;

public class Mergearrandsort {
    public static void main(String args[]){
        int[] a={1,2,3,4};
        int[] b={5,6,7,8};
        int n=a.length;
        int m=b.length;
        a=Arrays.copyOf(a, n+m);
        for(int i=0;i<b.length;i++){
            a[n+i] = b[i];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

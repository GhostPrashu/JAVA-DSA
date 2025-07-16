
import java.util.Arrays;

public class zerolast {
    public static void main(String[] args) {
        int [] n={3,0,1,0,4,0};
        int l=n.length-1;
        for(int i=n.length-1;i>=0;i--){
            if(n[i]!=0 ){
                int temp=n[i];
                n[i]=n[l];
                n[l]=temp;
                l-=1;

            }


        }
        System.out.println(Arrays.toString(n));
    }
}

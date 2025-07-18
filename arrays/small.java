import java.util.Arrays;

public class small {
    public static void main(String[] args) {
        int n[] = {8,1,2,2,3};
        int res[]=new int[n.length];
        int count=0;
        for (int i=0;i<n.length;i++){     
            for(int j=0;j<n.length;j++){
                if(n[j]<n[i]){
                    count++;
                }
            }
            res[i]=count;
            count=0;
        }
        System.out.println(Arrays.toString(res));
    }
}

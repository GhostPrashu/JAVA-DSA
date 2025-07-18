import java.util.Arrays;

public class sortbyparity {
    public static void main(String[] args) {
        int n[]={3,6,1,2,4};
        int j=n.length-1;
        int i=0;
        while(i<j){ 
            if(n[j]%2==0 & n[i]%2!=0){
                int temp=n[j];
                n[j]=n[i];
                n[i]=temp;
            }
            if(n[i]%2==0 ){
                i++;
            }
            if(n[j]%2==1){
                j--;
            }
        }
        System.out.println(Arrays.toString(n)); 
    }
}
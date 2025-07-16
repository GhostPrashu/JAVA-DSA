
import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<i/2;j++){
                if (i%j==0){
                    sum+=j;
                }
            
            }
            if(sum==i){
                count++;
                if 
                System.out.println(sum);
            }
        }
    }
}

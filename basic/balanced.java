
import java.util.Scanner;

public class balanced {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
            c+=1;
        }
        int mid=c/2;
        int l_sum=0;
        int r_sum=0;
        int cnt=0;
        if (c%2==0){
            while(cnt<=n)
                    {
                    while(rev>0){
                        if(cnt<=mid){
                            
                        int d=rev%10;
                        l_sum+=d;
                        rev=rev/10;
                        cnt+=1; 
                            }
                      
                    
                    else{
                        int d=rev%10;
                        r_sum+=d;
                        rev=rev/10;
                        cnt+=1;

                    }
                }
                if(l_sum==r_sum);
                System.out.println("balanced number");


            }
        }
            else{
            int count=0;
            while(count<=n)
                    {
                    while(rev>0){
                        if(count<=mid){
                            
                        int d=rev%10;
                        l_sum+=d;
                        rev=rev/10;
                        count+=1; 
                            }
                      rev=rev/10;
                    int d=0;
                    while(rev>10)
                        
                        d=rev%10;
                        r_sum+=d;
                        rev=rev/10;
                        count+=1;

                    }
                }

            }
        }

        
        
        }
    

    


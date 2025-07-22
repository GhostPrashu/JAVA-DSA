
// import java.util.Scanner;

// public class sumofevenodd {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int  n=sc.nextInt();
//         int rev=0;
//         while(n>0){
//            int digit=n%10;
//            rev=rev*10+digit;
//            n=n/10;
//         }
//         String o="";
//         String e="";
//         while(rev>0){
//             int num=rev%10;
//             if (num%2==0){
//                 e+=String.valueOf(num);
//             }
//             else{
//                 o+=String.valueOf(num);
//             }
//             rev=rev/10;

        
//         }

//         int diff=Integer.parseInt(e)-Integer.parseInt(o);
//         System.out.println(diff);
//     }
// }

import java.util.Scanner;

public class sumofevenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  n=sc.nextInt();
        int rev=0;
        while(n>0){
           int digit=n%10;
           rev=rev*10+digit;
           n=n/10;
        }
        int o=0;
        int e=0;
        while(rev>0){
            int num=rev%10;
            if (num%2==0){
                e=e*10+num;
            }
            else{
                o=o*10+num;
            }
            rev=rev/10;

        
        }


        int diff=e-o;
        System.out.println(diff);
    }
}

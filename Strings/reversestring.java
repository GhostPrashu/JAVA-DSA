package Strings;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        // for (int i=st.length()-1;i>=0;i--){
        //     System.out.print(st.charAt(i));
        // }
        char[] rev=st.toCharArray();
        int left=0;
        int right=st.length()-1;
        while (left<right) {
            char temp=rev[left];
            rev[left]=rev[right];
            rev[right]=temp;
            left++;
            right--;
        }
        String res=new String(rev);
        System.out.println(res);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        String c=sc.nextLine();
        if(s.length()!=c.length()){
            System.out.println("false");
        }
        else{
            char[] sh=s.toCharArray();
            char[] ch=c.toCharArray();
            Arrays.sort(sh);
            Arrays.sort(ch);
            if(Arrays.equals(sh, ch)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}

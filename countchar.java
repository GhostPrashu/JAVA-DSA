import java.util.Scanner;

public class countchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] c= new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            c[ch]++;
        }
        boolean[] printed=new boolean[256];
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(!printed[k]){
                System.out.println(k+":"+c[k]);
                printed[k]=true;
            }
        }
    }
}
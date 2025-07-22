import java.util.Scanner;

public class alternativecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(i%2==0){
                ch[i]=Character.toLowerCase(ch[i]);
            }
            else{
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(new String(ch));
    }
}

import java.util.Scanner;

public class titlecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ch=s.split(" ");
        for(int i=0;i<ch.length;i++){
            ch[i]=Character.toUpperCase(ch[i].charAt(0))+ch[i].substring(1);
        }
        System.out.println(String.join(" ",ch));
    }
}

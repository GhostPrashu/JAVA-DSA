import java.util.Scanner;

public class oveltimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n= "";
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                for(int j=0;j<i;j++){
                    n+=s.charAt(i);
                }

            }
            n+=s.charAt(i);
        }
        System.out.println(n);
    }
}

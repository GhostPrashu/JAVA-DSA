import java.util.Scanner;

public class longestunique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String current="";
        String longest="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(current.indexOf(c)!=-1){
                current=current.substring(current.indexOf(c)+1);

            }
            current+=c;
            if(current.length()>longest.length()){
                longest=current;
            }
        }
        System.out.println(s);
        System.out.println(longest);
    }
}

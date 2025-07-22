import java.util.Scanner;

public class vowelsconsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        String replace="helloworld";
        char[] rep=replace.toCharArray();
        int vc=0;
        int cc=0;
        for(char i:ch){
            if("aeiou".indexOf(i)!=-1){
                vc++;
            }
            else{
                cc++;
            }
        }
        for (char j:rep){
            if("aeiou".indexOf(j)!=-1){
                replace=replace.replace(j,'@');
            }
        }
        System.out.println(vc);
        System.out.println(cc);
        System.out.println(replace);

    }
}

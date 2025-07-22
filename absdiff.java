import java.util.Scanner;

public class absdiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int left=0;
        int right=str.length()-1;
        int vc1=0;
        int vc2=0;
        while(left<=right){
            if("aeiouAEIOU".indexOf(str.charAt(left))!=-1 && left!=right){
                
                vc1++;
            }
            if("aeiouAEIOU".indexOf(str.charAt(right))!=-1){
                vc2++;
            }
            left++;
            right--;
        }
        System.out.println(Math.abs(vc1-vc2));
    }
}

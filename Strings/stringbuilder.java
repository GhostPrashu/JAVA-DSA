package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Logic");
        sb.append("while");
        System.out.println(sb);
        sb.insert(6, "and");
        System.out.println(sb);
        sb.replace(0, 5, "Loop");
        System.out.println(sb);
        sb.delete(4, 8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String finaString=sb.toString();
        System.out.println(finaString);
    }
}

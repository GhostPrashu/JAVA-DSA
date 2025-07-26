
public class strbasics {
    public static void main(String[] args) {
        String str="Java";
        String str2="java";
        System.out.println(str.substring(2));
        System.out.println(str.trim());
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.compareTo(str2));
        System.out.println(str.contains(str2));
        String[] parts=str.trim().split(" ");
        System.out.println(parts[0]);
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.startsWith("Ja"));
        
    }
}

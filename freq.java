public class freq {
    public static void main(String[] args) {
        String s="bcabcabcccbb";
        String ss="ab";
        String res="";
        int i=0;
        while(i<=s.length()-ss.length()){
            if(s.substring(i,i+ss.length()).equals(ss)){
                i+=ss.length();
            }
            else{
                res+=s.charAt(i);
                i++;
            }
        }
        // while (i<s.length()) {
             res+=s.charAt(i++);
        
        System.out.println(res);

    }
}

public class righttri {
    public static void main(String[] args) {
        int n=5;
        int s=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            
        }
        System.out.println ();
        s--;
    }
}
}

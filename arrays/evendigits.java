public class evendigits {
    public static void main(String args[]){
        int n[]={12,345,2,6,7896};
        int count=0;
        for(int i:n){
            int digitcount=0;
            while(i>0){
                // i=i%10;
                digitcount+=1;
                i=i/10;
                // System.out.println(i+"i");
                
            }
            // System.out.println(digitcount);
            if(digitcount%2==0){
                count+=1;
            }

        }
        System.out.println(count);
    }
}

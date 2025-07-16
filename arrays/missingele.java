public class missingele {
    public static void main(String args[]){
        int[] miss={3,0,1};
        int sum=0;
        int n=miss.length;
        for (int i=0;i<miss.length;i++){
            sum=n*(n+1)/2;
        }
        System.out.println(sum/miss.length);
    }
}

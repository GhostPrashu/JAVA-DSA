public class mirror {
    public static void main(String[] args) {
        int [] a={1,2,3,3,2,1};
       System.out.println( check(a));
    }
    static boolean check(int []a){
        int i=0;
        int j=a.length-1;
        while(i<=j){
            if (a[j]==a[i]){
                j--;
                i++;
            }
            else{       
                 return false;
}
        }
        return true;
            

    }
}
